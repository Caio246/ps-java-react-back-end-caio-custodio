package br.com.banco.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name="transferencia")
public class BancoEntity {

    @Id
    private Integer id;

    @Column(name="data_transferencia")
    private Date dataTransferencia;

    @Column(name="valor")
    private Float valor;

    @Column(name="tipo")
    private String tipo;

    @Column(name="nome_operador_transacao")
    private String nomeOperadorTransacao;

    @Column(name="conta_id")
    private Integer conta_id;
}
