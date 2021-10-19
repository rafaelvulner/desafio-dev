package br.com.bycoders.desafio.controller;

import br.com.bycoders.desafio.service.DesafioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/desafio")
public class DesafioController {

    @Autowired
    private DesafioService service;

    @GetMapping("/isAlive")
    public String isAlive(){
        return "isAlive";
    }

    @PostMapping("/uploadArquivo")
    public ResponseEntity<Void> uploadArquivo(@RequestParam("file") MultipartFile file) {

        this.service.processarArquivo(file);

        return ResponseEntity.ok().build();
    }
}
