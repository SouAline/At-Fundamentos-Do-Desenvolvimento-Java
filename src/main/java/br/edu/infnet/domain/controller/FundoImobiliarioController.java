package br.edu.infnet.domain.controller;

import br.edu.infnet.domain.model.FundoImobiliario;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.service.FundoImobiliarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class FundoImobiliarioController {

    @Autowired
    private FundoImobiliarioService fundoImobiliarioService;

    @GetMapping(value = "fundoImolibiario/lista")
    public String telaLista(Model model, @SessionAttribute("user")Usuario usuario){
        model.addAttribute("fundoImobiliario", fundoImobiliarioService.obterLista(usuario));
        return "/fundoImobiliario/lista";
    }
    @GetMapping(value = "/cadastramento")
    public String cadastro(){
        return "/fundoImobiliario/lista";
    }

    @GetMapping(value = "fundoImobiliario/cadastro")
    public String telacadastro(){
        return "/fundoImobiliario/cadastro";
    }

    @PostMapping(value = "/fundoImobiliario/incluir")
    public String incluir(Model model, FundoImobiliario fundoImobiliario, @SessionAttribute("user")Usuario usuario){
        fundoImobiliario.setUsuario(usuario);
        fundoImobiliarioService.incluir(fundoImobiliario);
        model.addAttribute("mensagem", "O fundo imobiliário " + fundoImobiliario.getNome() + " foi cadastrado com sucesso!");
        return telaLista(model, usuario);
    }

    @GetMapping(value = "/fundoImobiliario/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute ("user") Usuario usuario){
        FundoImobiliario fundoImobiliario = fundoImobiliarioService.obterPorId(id);
        String mensagem = null;
        try{
            fundoImobiliarioService.excluir(id);
            mensagem = "A bebida " + fundoImobiliario.getNome() + " foi removido com sucesso";
        }catch (Exception e){
            mensagem = "Foi impossivel excluir" + fundoImobiliario.getNome();
        }
        model.addAttribute( "mensagem", mensagem);
        return telaLista(model, usuario);
    }

}
