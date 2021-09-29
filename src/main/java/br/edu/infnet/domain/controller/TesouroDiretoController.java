package br.edu.infnet.domain.controller;

import br.edu.infnet.domain.model.TesouroDireto;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.service.TesouroDiretoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class TesouroDiretoController {

    @Autowired
    private TesouroDiretoService tesouroDiretoService;

    @GetMapping(value = "/tesouroDireto/cadastro")
    public String telaCadastro(){
        return "tesouroDireto/cadastro";
    }

    @GetMapping(value = "/tesouroDireto/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("tesouroDireto", tesouroDiretoService.obterLista(usuario));

        return "tesouroDireto/lista";
    }

    @PostMapping(value = "/tesouroDireto/incluir")
    public String incluir(Model model, TesouroDireto tesouroDireto, @SessionAttribute("user") Usuario usuario) {

     tesouroDireto.setUsuario(usuario);

        tesouroDiretoService.incluir(tesouroDireto);

        model.addAttribute("mensagem", "Tesouro Direto " + tesouroDireto.getNome() + " cadastrada com sucesso!!!");

        return telaLista(model, usuario);
    }

    @GetMapping(value = "/cadastrar")
    public String cadastrar(){
        return "/tesouroDireto/lista";
    }

    @GetMapping(value = "/tesouroDireto/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario){
        TesouroDireto tesouroDireto = tesouroDiretoService.obterPorId(id);
        tesouroDiretoService.excluir(id);
        model.addAttribute("mensagem", "O tesouro direto " + tesouroDireto.getNome() + " foi excluido com sucesso!");
        return telaLista(model, usuario);
    }
}
