package br.com.banco.controllers;

import br.com.banco.repository.BancoRepository;
import br.com.banco.services.BancoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/servicos")
public class BancoControllers {

    @Autowired
    BancoServices bancoServices;

    @Autowired
    private BancoRepository bancoRepository;

    @GetMapping
    public ResponseEntity getAllContas(){

        var retornarTodasAsContas = bancoRepository.findAll();

        return ResponseEntity.ok(retornarTodasAsContas);
    }
}