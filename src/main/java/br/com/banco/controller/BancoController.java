package br.com.banco.controller;

import br.com.banco.service.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController(value = )
public class BancoController {

    @Autowired
    BancoService bancoService;

    @GetMapping
    String get(@PathParam(value = "id") Integer id) {
        return  "Hope" + id;
    }
}
