package br.edu.infnet.domain.teste;

import java.time.LocalDateTime;

import br.edu.infnet.domain.exceptions.InvalidTipoException;
import br.edu.infnet.domain.model.TesouroDireto;

public class TesouroDiretoTeste {
	
	public static void main(String[] args) {
		TesouroDireto cota1 = new TesouroDireto("NTNB01017", 95.0f, 1, "IPCA", "2045", 8.5f );
		try {
			cota1.validaTipo();
			System.out.println(cota1);
		}catch (InvalidTipoException mensagem){
			mensagem.printStackTrace();
		}
			
	}

}
