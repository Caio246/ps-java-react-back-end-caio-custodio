package br.com.banco.repository;

import br.com.banco.entities.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface BancoRepository extends JpaRepository <Transferencia, Id> {

}
