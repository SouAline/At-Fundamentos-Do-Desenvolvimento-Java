package br.edu.infnet.atjava;


import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.service.AcaoService;
import br.edu.infnet.domain.service.FundoImobiliarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class AtivoLoader implements ApplicationRunner {

    @Autowired
    private AcaoService acaoService;

    @Autowired
    private FundoImobiliarioService fundoImobiliarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception{

        Usuario usuario = new Usuario();
    }
}
