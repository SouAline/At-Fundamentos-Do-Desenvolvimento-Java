package br.edu.infnet.domain.teste;

import br.edu.infnet.domain.exceptions.InvalidRiscoException;
import br.edu.infnet.domain.model.FundoImobiliario;

public class FundoImobiliarioTeste {
	public static void main(String[] args) {
		FundoImobiliario fundo1 = new FundoImobiliario("Abc", 56.0f, 5, "Cvc", 8.0f, 1);
		try {
			fundo1.validaRisco();
			System.out.println(fundo1);
		}catch(InvalidRiscoException mensagem){
			mensagem.printStackTrace();
			
		}
	}
}
