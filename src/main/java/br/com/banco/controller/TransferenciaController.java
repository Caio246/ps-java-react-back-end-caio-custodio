package br.com.banco.controller;

import br.com.banco.entities.Transferencia;
import br.com.banco.services.TransferenciaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/servicos/transferencias")
@RestController
public class TransferenciaController {

    private final TransferenciaService transferenciaService;
    private static final String DEFAULT_MIN_DATE = "2019-01-01";
    private static final String DEFAULT_MAX_DATE = "";

    @GetMapping
    public List<Transferencia> findAll(
            @RequestParam(value="minDate", defaultValue=DEFAULT_MIN_DATE) String minDate,
            @RequestParam(value="maxDate", defaultValue=DEFAULT_MAX_DATE) String maxDate) {
        return transferenciaService.findByDataTransferenciaBetween(minDate, maxDate);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        Optional<Transferencia> transferenciaOptional = transferenciaService.findById(id);
        if (transferenciaOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Transferencia com ID " + id + " não encontrada.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(transferenciaOptional.get());
    }

    @GetMapping("/nomes/{nome}")
    public ResponseEntity<Object> getTransferenciaByNomeOperadorTransacao(
            @PathVariable String nome,
            @RequestParam(value="minDate", defaultValue=DEFAULT_MIN_DATE) String minDate,
            @RequestParam(value="maxDate", defaultValue=DEFAULT_MAX_DATE) String maxDate) {
        Optional<List<Transferencia>> transferenciaOptional = transferenciaService.findByNomeOperadorTransacao(nome);
        if (transferenciaOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhuma operação com este nome foi encontrada.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(transferenciaOptional.get());
    }

}
