package br.com.banco.controllers.dto;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;

import java.util.Date;

public record TransferenciaResponseDTO(Long id, Date dataTransferencia, Integer valor, String tipo, String nomeOperadorTransacao, Conta conta) {
    public TransferenciaResponseDTO(Transferencia transferencia) {
        this(transferencia.getId(),
                transferencia.getDataTransferencia(),
                transferencia.getValor(),
                transferencia.getTipo(),
                transferencia.getNomeOperadorTransacao(),
                transferencia.getConta());
    }
}
