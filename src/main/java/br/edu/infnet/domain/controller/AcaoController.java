package br.edu.infnet.domain.controller;

import br.edu.infnet.domain.model.Acao;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.service.AcaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AcaoController {

    @Autowired
    private AcaoService acaoService;

    @GetMapping(value ="/acao/lista")
    public String telaLista(Model model) {
        model.addAttribute("acoes", acaoService.obterLista());
        return "acao/lista";
    }
    @GetMapping(value = "/cadastro")
    public String cadastro(){
        return "/acao/lista";
    }

    @GetMapping(value = "/acao/cadastro")
    public String telaCadastro(){
        return "/acao/cadastro";
    }

    @PostMapping(value = "/acao/incluir")
    public String incluir(Model model, Acao acao, @SessionAttribute("user") Usuario usuario){
        acao.setUsuario(usuario);
        acaoService.incluir(acao);
        model.addAttribute("mensagem", "A ação " + acao.getNome() + " da empresa " + acao.getEmpresa()+ " foi cadastrado com sucesso");
        return telaLista(model);
    }

    @GetMapping(value = "/acao/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id){
        Acao acao = acaoService.obterPorId(id);
        acaoService.excluir(id);
        model.addAttribute("mensagem", "Ativo" + acao.getNome() + " excluido com sucesso!");
        return telaLista(model);
    }
}
