package com.gerencial.app.services;

import com.gerencial.app.entities.Produto;
import com.gerencial.app.repositories.ProdutoRepository;
import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository; //Tipo e nome

    public Produto cadastrarProduto(Produto produto){ //Tipo e nome

        Preconditions.checkNotNull(produto); //Checa se não esta nulo
        Preconditions.checkNotNull(produto.getCodigoBarras()); //Checa se esta nulo

        return repository.save(produto); //Retorna o produto
    }

    public List<Produto> consultaTodos(){

        return (List<Produto>) repository.findAll(); //Converte o iterable para tipo list;
    }
}
