package br.edu.infnet.domain.controller;

import br.edu.infnet.domain.model.Ativo;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.service.AtivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class AtivoController {

    @Autowired
    private AtivoService ativoService;

    @GetMapping(value = "/ativo/lista")
    public String telaLista(Model model, @SessionAttribute("user")Usuario usuario){
        model.addAttribute("ativos", ativoService.obterLista(usuario));
        return "ativo/lista";
    }

    @GetMapping(value = "/ativo/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario){
        Ativo ativo = ativoService.obterPorId(id);
        String mensagem = null;
        try{
            ativoService.excluir(id);
            mensagem = "O ativo " + ativo.getNome() + " foi removido com sucesso";
        }catch (Exception e){
            mensagem = "Não foi possivel excluir o ativo " + ativo.getNome();
        }
        model.addAttribute("mensagem", mensagem);
        return telaLista(model, usuario);

    }
}
