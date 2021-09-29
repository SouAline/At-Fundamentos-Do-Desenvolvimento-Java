package br.edu.infnet.domain.repository;


import br.edu.infnet.domain.model.FundoImobiliario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FundoImobiliarioRepository extends CrudRepository<FundoImobiliario, Integer> {
    @Query("from FundoImobiliario f where f.usuario.id = :userId")
    public List<FundoImobiliario> obterLista(Integer userId);
}
