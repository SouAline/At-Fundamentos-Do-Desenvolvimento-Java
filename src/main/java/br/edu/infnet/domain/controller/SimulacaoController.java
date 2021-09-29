package br.edu.infnet.domain.controller;


import br.edu.infnet.domain.model.Ativo;
import br.edu.infnet.domain.model.Simulacao;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.service.AtivoService;
import br.edu.infnet.domain.service.InvestidorService;
import br.edu.infnet.domain.service.SimulacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SimulacaoController {

    @Autowired
    private SimulacaoService simulacaoService;
    @Autowired
    private InvestidorService investidorService;
    @Autowired
    private AtivoService ativoService;

    @GetMapping(value = "/simulacao/incluir")
    public String tela(Model model, @SessionAttribute("user")Usuario usuario){
        model.addAttribute("investidores", investidorService.obterLista(usuario));

        model.addAttribute("ativos", ativoService.obterLista(usuario));

        return "simulacao/cadastro";
    }
    @GetMapping(value = "/simulacao/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("simulacao", simulacaoService.obterLista(usuario));

        return "simulacao/lista";
    }
    @PostMapping(value = "/simulacao/cadastrar")
    public String incluir(Model model, Simulacao simulacao, @RequestParam String[] ativosId, @SessionAttribute("user") Usuario usuario) {

        List<Ativo> ativos = new ArrayList<Ativo>();

        for(String id : ativosId) {
            ativos.add(ativoService.obterPorId(Integer.valueOf(id)));
        }

        simulacao.setAtivos(ativos);

        simulacao.setUsuario(usuario);

        simulacaoService.incluir(simulacao);

        String mensagem = "A simulação "+ simulacao.getDescricao() +" foi cadastrado com sucesso!!!";

        model.addAttribute("mensagem", mensagem);

        return telaLista(model, usuario);
    }

    @GetMapping(value = "/simulacao/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

        Simulacao simulacao = simulacaoService.obterPorId(id);

        simulacaoService.excluir(id);

        String mensagem = "A simulacao " + simulacao.getDescricao() + " foi removido com sucesso!!!";

        model.addAttribute("mensagem", mensagem);

        return telaLista(model, usuario);
    }
}
