package com.gerencial.app.controller;

import com.gerencial.app.entities.Produto;
import com.gerencial.app.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> inserirPoduto(@RequestBody Produto produto){

        service.cadastrarProduto(produto);

        return new ResponseEntity<>(produto, HttpStatus.CREATED);

    }

    @GetMapping
    public List<Produto> consultaTodos(){
        return service.consultaTodos();
    }

}
