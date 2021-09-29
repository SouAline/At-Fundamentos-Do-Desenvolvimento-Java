package br.edu.infnet.domain.service;

import br.edu.infnet.atjava.client.EnderecoClient;
import br.edu.infnet.domain.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoClient enderecoClient;

    public Endereco buscarCep(String cep){
        return enderecoClient.buscarCep(cep);
    }


}
