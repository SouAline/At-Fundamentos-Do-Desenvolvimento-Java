package br.edu.infnet.domain.repository;

import br.edu.infnet.domain.model.Ativo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtivoRepository extends CrudRepository<Ativo, Integer> {

    @Query("from Ativo atv where atv.usuario.id = :userId")
    public List<Ativo> obterLista(Integer userId);
}
