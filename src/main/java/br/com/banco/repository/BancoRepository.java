package br.com.banco.repository;

import br.com.banco.entities.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface BancoRepository extends JpaRepository <Transferencia, Id> {}
