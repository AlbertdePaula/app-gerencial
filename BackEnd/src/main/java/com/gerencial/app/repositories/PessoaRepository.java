
package com.gerencial.app.repositories;

import com.gerencial.app.entities.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

}