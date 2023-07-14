package br.com.banco.controller;

import br.com.banco.entities.Transferencia;
import br.com.banco.services.BancoServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/servicos")
public class BancoController {

    final BancoServices bancoServices;

    public BancoController(BancoServices bancoServices) {
        this.bancoServices = bancoServices;
    }

    @GetMapping
    public ResponseEntity<List<Transferencia>> getAllTransferencia(){
        return ResponseEntity.status(HttpStatus.OK).body(bancoServices.findAll());
    }

}