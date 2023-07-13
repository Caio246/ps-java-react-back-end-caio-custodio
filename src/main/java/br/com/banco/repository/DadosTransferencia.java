package br.com.banco.repository;

import lombok.Data;

@Data
public class DadosTransferencia {

    private String banco;
    private String agencia;
    private String conta;

    public DadosTransferencia(String banco) {
        this.banco = banco;
    }
}
