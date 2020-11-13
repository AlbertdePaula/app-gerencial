package com.gerencial.app.repositories; //Ultima camada antes de chegar ao banco, cara que busca no deposito;

import com.gerencial.app.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}