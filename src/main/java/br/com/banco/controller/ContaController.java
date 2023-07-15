package br.com.banco.controller;

import br.com.banco.entities.Conta;
import br.com.banco.services.ContaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/servicos/contas")
public class ContaController {

    private final ContaService contaServices;

    @GetMapping
    public ResponseEntity<List<Conta>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(contaServices.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        Optional<Conta> contaOptional = contaServices.findById(id);
        if (contaOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Infelizemente há conta com ID " + id + " não foi encontrada pelo sistema.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(contaOptional.get());
    }

}