package br.edu.infnet.domain.service;

import br.edu.infnet.domain.model.Simulacao;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.repository.SimulacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimulacaoService {

    @Autowired
    private SimulacaoRepository simulacaoRepository;

    public List<Simulacao> obterLista(Usuario usuario){
        return simulacaoRepository.obterLista(usuario.getId());
    }

    public List<Simulacao> obterLista(){

        return (List<Simulacao>) simulacaoRepository.findAll();
    }

    public void incluir(Simulacao pedido) {

        simulacaoRepository.save(pedido);
    }

    public void excluir(Integer id) {
        simulacaoRepository.deleteById(id);
    }

    public Simulacao obterPorId(Integer id) {
        return simulacaoRepository.findById(id).orElse(null);
    }

    public Integer obterQuantidade(){
        return(int) simulacaoRepository.count();
    }
}
