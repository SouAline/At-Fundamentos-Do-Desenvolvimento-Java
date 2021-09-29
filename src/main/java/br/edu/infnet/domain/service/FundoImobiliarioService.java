package br.edu.infnet.domain.service;


import br.edu.infnet.domain.model.FundoImobiliario;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.repository.FundoImobiliarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundoImobiliarioService {

    @Autowired
    private FundoImobiliarioRepository fundoImobiliarioRepository;

    public List<FundoImobiliario> obterLista(Usuario usuario){
        return(List<FundoImobiliario>) fundoImobiliarioRepository.obterLista(usuario.getId());
    }

    public List<FundoImobiliario> obterLista(){
        return (List<FundoImobiliario>) fundoImobiliarioRepository.findAll();
    }

    public void incluir (FundoImobiliario fundoImobiliario){
        fundoImobiliarioRepository.save(fundoImobiliario);
    }

    public void excluir(Integer id) {
        fundoImobiliarioRepository.deleteById(id);
    }


    public FundoImobiliario obterPorId(Integer id){

        return fundoImobiliarioRepository.findById(id).orElse(null);
    }

    public Integer obterQuantidade(){
        return (int) fundoImobiliarioRepository.count();
    }



}

