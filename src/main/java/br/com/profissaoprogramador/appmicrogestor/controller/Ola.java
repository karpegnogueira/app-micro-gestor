package br.com.profissaoprogramador.appmicrogestor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ola {
    @GetMapping
    public String test(){
        return "funfou arretado!";
    }
}
