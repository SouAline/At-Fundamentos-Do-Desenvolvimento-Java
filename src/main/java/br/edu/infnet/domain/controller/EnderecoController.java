package br.edu.infnet.domain.controller;

import br.edu.infnet.domain.service.EnderecoService;
import org.hibernate.type.StringNVarcharType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping(value="/buscarCep")
    public String buscaCep(Model model, @RequestParam String cep){//clase auxiliar que pega as informações da tela e passa ao controller
        model.addAttribute("endereco", enderecoService.buscarCep(cep));
        return "/usuario/cadastro";
    }

}
