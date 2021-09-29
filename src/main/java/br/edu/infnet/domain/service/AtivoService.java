package br.edu.infnet.domain.service;

import br.edu.infnet.domain.model.Ativo;
import br.edu.infnet.domain.model.Usuario;
import br.edu.infnet.domain.repository.AtivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtivoService {
    @Autowired
    private AtivoRepository ativoRepository;

    public List<Ativo> obterLista(Usuario usuario) {
        return (List<Ativo>) ativoRepository.obterLista(usuario.getId());
    }

    public List<Ativo> obterLista() {
        return (List<Ativo>) ativoRepository.findAll();
    }

    public void excluir(Integer id) {
        ativoRepository.deleteById(id);
    }

    public Ativo obterPorId(Integer id) {
        return ativoRepository.findById(id).orElse(null);
    }

}
