package br.edu.infnet.domain.service;

import br.edu.infnet.domain.model.Acao;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.repository.AcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcaoService {

    @Autowired
    private AcaoRepository acaoRepository;

    public List<Acao> obterLista(Usuario usuario){
       return (List<Acao>) acaoRepository.obterLista(usuario.getId());
    }
    public List<Acao> obterLista(){
        return (List<Acao>) acaoRepository.findAll();
    }

    public void incluir(Acao acao){

        acaoRepository.save(acao);
    }

    public void excluir(Integer id){
        acaoRepository.deleteById(id);
    }

    public Acao obterPorId(Integer id){

        return acaoRepository.findById(id).orElse(null);
    }

    public Integer obterQuantidade(){
        return(int) acaoRepository.count();
    }
}
