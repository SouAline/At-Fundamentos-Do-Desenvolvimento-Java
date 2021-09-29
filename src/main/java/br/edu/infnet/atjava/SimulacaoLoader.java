package br.edu.infnet.atjava;

import br.edu.infnet.domain.model.*;
import br.edu.infnet.domain.service.SimulacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Order(4)
public class SimulacaoLoader implements ApplicationRunner {

    @Autowired
    private SimulacaoService simulacaoService;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Usuario usuario = new Usuario();

        Investidor investidor = new Investidor();

        Acao a1 = new Acao();

        TesouroDireto t1 = new TesouroDireto();
        FundoImobiliario f1 = new FundoImobiliario();
        List<Ativo> ativos = new ArrayList<Ativo>();
        ativos.add(a1);
        ativos.add(t1);
        ativos.add(f1);

        Simulacao simulacao = new Simulacao();
        simulacao.setDescricao("Investimento nivel um");
        simulacao.setAtivos(ativos);
        simulacao.setInvestidor(investidor);
        simulacao.setUsuario(usuario);

        simulacaoService.incluir(simulacao);
    }
}
