
package com.gerencial.app.controller;

import com.gerencial.app.entities.Pessoa;
import com.gerencial.app.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping
    public List<Pessoa> consultaPessoas() {
        return service.consultaTodos();
    }

    @GetMapping(path = "/{id}")
    public Optional<Pessoa> consultaPessoaId(@PathVariable Long id){
        return service.consultaPessoaId(id);
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvarPessoa(@RequestBody Pessoa pessoa){

        service.salvarPessoa(pessoa);

        return new ResponseEntity<>(pessoa, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Pessoa> alterarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa){

        Pessoa pessoaBanco = service.consultaPessoaId(id).get();
        pessoaBanco.setNome(pessoa.getNome());
        pessoaBanco.setEmail(pessoa.getEmail());
        pessoaBanco.setTelefone(pessoa.getTelefone());

        service.salvarPessoa(pessoa);

        return new ResponseEntity<>(pessoa, HttpStatus.OK);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Pessoa> deletarPessoa(@PathVariable Long id){

        service.deletarPessoa(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }
}
