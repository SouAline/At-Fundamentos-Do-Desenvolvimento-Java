package br.edu.infnet.domain.repository;

import br.edu.infnet.domain.model.Simulacao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SimulacaoRepository extends CrudRepository<Simulacao, Integer> {

    @Query("from Simulacao s where s.usuario.id = :userId")
    public List<Simulacao> obterLista(Integer userId);
}
