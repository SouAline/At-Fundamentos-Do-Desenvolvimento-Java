package br.edu.infnet.domain.repository;

import br.edu.infnet.domain.model.TesouroDireto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TesouroRepository extends CrudRepository<TesouroDireto, Integer> {
    @Query("from TesouroDireto td where td.usuario.id = :userId")
    public List<TesouroDireto> obterLista(Integer userId);

}
