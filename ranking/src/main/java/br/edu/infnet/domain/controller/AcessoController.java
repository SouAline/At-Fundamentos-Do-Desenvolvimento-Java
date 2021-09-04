package br.edu.infnet.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AcessoController {
	
	@GetMapping(value= "/")
	public String telaLogin() {
		return "/login";
		
	}
	
	@PostMapping(value= "/login")
	public String login() { 
	return "/index";
	}
}