package br.com.banco.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Table(name="transferencia")
@Entity(name="transferencia")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transferencia{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="data_transferencia")
    private Date dataTransferencia;

    @Column(name="valor")
    private Integer valor;

    @Column(name="tipo")
    private String tipo;

    @Column(name="nome_operador_transacao")
    private String nomeOperadorTransacao;

    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Conta conta;
}
