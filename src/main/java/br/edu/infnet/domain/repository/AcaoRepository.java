package br.edu.infnet.domain.repository;

import br.edu.infnet.domain.model.Acao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcaoRepository extends CrudRepository<Acao, Integer> {

    @Query("from Acao a where a.usuario.id = :userId")
    public List<Acao> obterLista(Integer userId);
}
