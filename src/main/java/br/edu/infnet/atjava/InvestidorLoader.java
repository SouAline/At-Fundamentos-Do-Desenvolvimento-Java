package br.edu.infnet.atjava;

import br.edu.infnet.domain.model.Investidor;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.service.InvestidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class InvestidorLoader implements ApplicationRunner {

    @Autowired
    private InvestidorService investidorService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setId(1);

        Investidor investidor = new Investidor("Marcelo", "marcelo@marcelo.com", 36);
        investidor.setUsuario(usuario);

        investidorService.incluir(investidor);
        System.out.println(investidor.getNome());
    }
}
