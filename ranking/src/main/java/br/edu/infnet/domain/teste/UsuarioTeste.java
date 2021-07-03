package br.edu.infnet.domain.teste;

import br.edu.infnet.domain.model.Usuario;

public class UsuarioTeste {
	
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Maria","maria@teste.com", "conservador");
		System.out.println(usuario1);
	}

}
