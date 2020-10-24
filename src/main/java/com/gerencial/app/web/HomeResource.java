package com.gerencial.app.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello")
public class HomeResource {

    @GetMapping(path = "/{prm}")
    public String gethello(@PathVariable String prm){

        return "O parametro passado foi: " + prm;
    }
}