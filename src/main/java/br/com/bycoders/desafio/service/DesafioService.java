package br.com.bycoders.desafio.service;

import br.com.bycoders.desafio.repository.DesafioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DesafioService {

    @Autowired
    private DesafioRepository repository;

    public void processarArquivo(MultipartFile file){

    }
}
