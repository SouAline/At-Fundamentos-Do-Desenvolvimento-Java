package br.edu.infnet.domain.teste;

import br.edu.infnet.domain.model.Simulacao;
import br.edu.infnet.domain.model.Usuario;

public class SimulacaoTeste {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Maria", "maria@teste.com", "conservador");

        Simulacao s1 = new Simulacao();
        s1.setUsuario(usuario1);
        s1.setDescricao("realizou uma simulacao de investimento no dia");
        System.out.println("Simulacao: " + s1);

    }
}
