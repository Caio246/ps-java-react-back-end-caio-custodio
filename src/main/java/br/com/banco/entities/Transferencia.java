package br.com.banco.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
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

    @Column(name="data_transferencia", nullable = false)
    private Date dataTransferencia;

    @Column(name="valor", nullable = false, precision = 20, scale = 2)
    private BigDecimal valor;

    @Column(name="tipo", nullable = false,length = 15)
    private String tipo;

    @Column(name="nome_operador_transacao", length = 50)
    private String nomeOperadorTransacao;

    @ManyToOne
    @JoinColumn(name = "conta_id", nullable = false)
    private Conta conta;
}
