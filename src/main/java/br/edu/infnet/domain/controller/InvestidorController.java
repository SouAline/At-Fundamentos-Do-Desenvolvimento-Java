package br.edu.infnet.domain.controller;

import br.edu.infnet.domain.model.Investidor;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.service.InvestidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class InvestidorController {

    @Autowired
    private InvestidorService investidorService;

    @GetMapping(value = "/investidor")
    public String tela() {
        return "investidor/cadastro";
    }

    @GetMapping(value = "/investidor/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
        model.addAttribute("investidor", investidorService.obterLista(usuario));
        return "investidor/lista";
    }

    @PostMapping(value = "/investidor/incluir")
    public String incluir(Model model, Investidor investidor, @SessionAttribute("user") Usuario usuario) {
        investidor.setUsuario(usuario);
        investidorService.incluir(investidor);
        String mensagem = "o investidor " + investidor.getNome() + " foi cadastrado com sucesso.";
        model.addAttribute("mensagem", mensagem);

        return telaLista(model, usuario);
    }

    @GetMapping(value = "/investidor/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {
        Investidor investidor = investidorService.obterPorId(id);
        String mensagem = null;
        try {
            investidorService.excluir(id);
            mensagem = "O investidor " + investidor.getNome() + " foi removido";

        } catch (Exception e) {
            mensagem = "Foi impossivel remover o investidor" + investidor.getNome();
        }
        model.addAttribute("mensagem", mensagem);

        return telaLista(model, usuario);
    }
}
