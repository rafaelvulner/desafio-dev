package br.com.bycoders.desafio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desafio")
public class DesafioController {

    @GetMapping("/isAlive")
    public String isAlive(){
        return "isAlive";
    }
}
