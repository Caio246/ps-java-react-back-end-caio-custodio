package br.com.banco.repository;

import br.com.banco.entities.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TransferenciasRepository extends JpaRepository <Transferencia, Long> {

    List<Transferencia> findByDataTransferenciaBetween(LocalDate dataInicio, LocalDate dataFim);
    Optional<List<Transferencia>> findByNomeOperadorTransacao(String nome);

}
