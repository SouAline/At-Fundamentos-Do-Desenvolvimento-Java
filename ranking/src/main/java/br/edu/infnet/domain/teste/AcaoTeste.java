package br.edu.infnet.domain.teste;

import br.edu.infnet.domain.exceptions.InvalidEmpresaException;
import br.edu.infnet.domain.model.Acao;

public class AcaoTeste { 
	
	public static void main(String[] args) {
		Acao acao1 = new Acao("Vvar", 16.0f, 100, "Via Varejo", 0.75f, 5); 
		try {
			acao1.validaEmpresa();
			System.out.println(acao1);
		}catch(InvalidEmpresaException mensagem) {
			mensagem.printStackTrace();
		}
	}

}
