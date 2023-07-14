package br.com.banco.repository;

import br.com.banco.entities.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface BancoRepository extends JpaRepository <Transferencia, Long> {

    @Query("SELECT t FROM transferencia t WHERE t.dataTransferencia >= :dataTransferencia")
    List<Transferencia> findAllByPeriodo(LocalDateTime dataTransferencia);

}
