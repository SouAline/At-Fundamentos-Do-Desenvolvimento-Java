package br.edu.infnet.atjava.client;

import br.edu.infnet.domain.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://viacep.com.br/ws", name="enderecoClient")
public interface EnderecoClient {

    @GetMapping(value="/{cep}/json")
    public Endereco buscarCep(@PathVariable String cep);


}
