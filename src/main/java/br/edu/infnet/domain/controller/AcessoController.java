package br.edu.infnet.domain.controller;

import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@SessionAttributes("user")
@Controller
public class AcessoController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private InvestidorService investidorService;
    @Autowired
    private TesouroDiretoService tesouroDiretoService;
    @Autowired
    private AcaoService acaoService;
    @Autowired
    private SimulacaoService simulacaoService;

    @GetMapping(value = "/app")
    public String telaApp(Model model) {

        Map<String, Integer> mapaTotal = new HashMap<String, Integer>();
        mapaTotal.put("Usuarios", usuarioService.obterQtde());
        mapaTotal.put("Investidores", investidorService.obterQuantidade());
        mapaTotal.put("TesouroDireto", tesouroDiretoService.obterQuantidade());
        mapaTotal.put("Acoes", acaoService.obterQuantidade());
        mapaTotal.put("Simulacoes", simulacaoService.obterQuantidade());

        model.addAttribute("totalizacao", mapaTotal);

        return "app";
    }

    @GetMapping(value = "/login")
    public String telaLogin() {
        return "/login";
    }

    @GetMapping(value = "/")
    public String telaInicial() {
        return "/telaInicial";
    }

    @GetMapping(value = "/telaInicial")
    public String voltaInicial() {
        return "/telaInicial";
    }

    @GetMapping(value="/home")
    public String telaHome(){
        return "index";
    }

    @GetMapping(value="/logout")
    public String logout(HttpSession session, SessionStatus status){
        status.setComplete();
        session.removeAttribute("user");
        return  "redirect:/";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String senha) {

        Usuario usuario = usuarioService.validacao(email, senha);

        if (usuario != null) {
            model.addAttribute("user", usuario);
            return "index";

        } else {
            model.addAttribute("mensagem", "Email e/ou senha inválida!");

            return "/login";
        }
    }

    @GetMapping(value = "/usuario/cadastro")
    public String criarUsuario() {
        return "/usuario/cadastro";
    }


    @PostMapping(value = "/usuario/cadastro")
    public String cadastrar(Model model, Usuario usuario) {

        usuarioService.registrar(usuario);

        model.addAttribute("mensagem", "O usuário " + usuario.getNome() + " foi cadastrado com sucesso!");

        return "/login";
    }
}