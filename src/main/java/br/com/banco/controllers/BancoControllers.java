package br.com.banco.controllers;

import br.com.banco.controllers.dto.TransferenciaResponseDTO;
import br.com.banco.repository.BancoRepository;
import br.com.banco.services.BancoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/servicos")
@RestController
public class BancoControllers {

    @Autowired
    BancoServices bancoServices;

    @Autowired
    BancoRepository bancoRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping("/transferencias")
    public List<TransferenciaResponseDTO> getAll() {
        List<TransferenciaResponseDTO> tranferenciaList = bancoRepository.findAll().stream().map(TransferenciaResponseDTO::new).toList();
        return tranferenciaList;
    }

}