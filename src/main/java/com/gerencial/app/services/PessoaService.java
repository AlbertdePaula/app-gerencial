
package com.gerencial.app.services;

import com.gerencial.app.entities.Pessoa;
import com.gerencial.app.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> consultaTodos(){

        return (List<Pessoa>) repository.findAll();

    }
    public Optional<Pessoa> consultaPessoaId(Long id){

        return repository.findById(id);
    }
    public Pessoa salvarPessoa(Pessoa pessoa){

        return repository.save(pessoa);
    }
    public void deletarPessoa(Long id){

        repository.deleteById(id);
    }
}
