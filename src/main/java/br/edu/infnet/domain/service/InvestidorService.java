package br.edu.infnet.domain.service;

import br.edu.infnet.domain.model.Investidor;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.repository.InvestidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestidorService {

    @Autowired
    private InvestidorRepository investidorRepository;

    public List<Investidor> obterLista(Usuario usuario){
        return investidorRepository.obterLista(usuario.getId());
    }

    public List<Investidor> obterLista(){
        return (List<Investidor>) investidorRepository.findAll();
    }

    public void incluir(Investidor investidor){
    investidorRepository.save(investidor);
    }

    public void excluir(Integer id){
        investidorRepository.deleteById(id);
    }

    public Investidor obterPorId(Integer id){
        return investidorRepository.findById(id).orElse(null);
    }
    public Integer obterQuantidade() {
        return (int) investidorRepository.count();
    }
}
