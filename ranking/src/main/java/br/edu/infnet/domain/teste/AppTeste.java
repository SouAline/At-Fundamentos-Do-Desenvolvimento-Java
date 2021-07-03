package br.edu.infnet.domain.teste;

import br.edu.infnet.domain.exceptions.InvalidEmpresaException;
import br.edu.infnet.domain.exceptions.InvalidRiscoException;
import br.edu.infnet.domain.exceptions.InvalidTipoException;
import br.edu.infnet.domain.model.Acao;
import br.edu.infnet.domain.model.FundoImobiliario;
import br.edu.infnet.domain.model.TesouroDireto;
import br.edu.infnet.domain.model.Usuario;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class AppTeste {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
       // String arq = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + ".txt";

        try {
            try {
                InputStream resource = new ClassPathResource("static/ativos.txt").getInputStream();
                FileWriter fileW = new FileWriter(dir);

                BufferedWriter escrita = new BufferedWriter(fileW);
                BufferedReader leitura = new BufferedReader(new InputStreamReader(resource));

                String linha = leitura.readLine();
                while (linha != null) {
                    String[] campo = linha.split(";");
                    switch (campo[0].toUpperCase()) {
                        case "U":
                            Usuario usuario1 = new Usuario("Maria", "maria@teste.com", "conservador");
                            escrita.write(usuario1.toString());
                            break;

                        case "T":
                            TesouroDireto cota1 = new TesouroDireto("NTNB01017", 95.0f, 1, "IPCA", "2028", 8.5f);
                            cota1.validaTipo();
                            escrita.write(cota1.toString());
                            break;

                        case "F":
                            FundoImobiliario fundo1 = new FundoImobiliario("PRSV11", 56.0f, 5, "Presidente Vargas", 8.0f, 1);
                            fundo1.validaRisco();
                            escrita.write(fundo1.toString());
                            break;

                        case "A":
                            Acao acao1 = new Acao("Vvar3", 16.0f, 100, "Via Varejo", 0.75f, 5);
                            acao1.validaEmpresa();
                            escrita.write(acao1.toString());
                            break;

                        default:
                            System.out.println("Arquivo incorreto!");
                            break;
                    }
                    linha = leitura.readLine();
                }
                leitura.close();
                escrita.close();
                fileW.close();

            } catch (InvalidTipoException | InvalidRiscoException | InvalidEmpresaException | IOException mensagem) {
                System.out.println(mensagem.getMessage());
            }
        } finally {
            System.out.println("Processamento Encerrado: " + (dir));
        }
    }
}
