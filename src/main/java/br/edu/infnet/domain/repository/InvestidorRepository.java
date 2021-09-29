package br.edu.infnet.domain.repository;


import br.edu.infnet.domain.model.Investidor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestidorRepository extends CrudRepository<Investidor, Integer> {
    @Query("from Investidor i where i.usuario.id = :userId")
    public List<Investidor> obterLista(Integer userId);
}
