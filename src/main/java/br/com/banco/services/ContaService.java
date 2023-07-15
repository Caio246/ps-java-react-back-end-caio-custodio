package br.com.banco.services;

import br.com.banco.entities.Conta;
import br.com.banco.repository.ContaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ContaService {

    private final ContaRepository contaRepository;

    public List<Conta> findAll() {
        return contaRepository.findAll();
    }

    public Optional<Conta> findById(@PathVariable Long id) {
        return contaRepository.findById(id);
    }

}
