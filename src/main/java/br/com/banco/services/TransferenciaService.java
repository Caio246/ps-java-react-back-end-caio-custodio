package br.com.banco.services;

import br.com.banco.entities.Transferencia;
import br.com.banco.repository.TransferenciasRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TransferenciaService {

    private final TransferenciasRepository transferenciasRepository;

    public List<Transferencia> findByDataTransferenciaBetween(@RequestParam String minDate, @RequestParam String maxDate) {

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

        LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

        return transferenciasRepository.findByDataTransferenciaBetween(min, max);
    }

    public Optional<Transferencia> findById(@PathVariable Long id) {
        return transferenciasRepository.findById(id);
    }

    public Optional<List<Transferencia>> findByNomeOperadorTransacao(@PathVariable String nome) {
        return transferenciasRepository.findByNomeOperadorTransacao(nome);
    }

}

