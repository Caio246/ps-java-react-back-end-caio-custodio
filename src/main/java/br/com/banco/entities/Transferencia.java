package br.com.banco.entities;

import br.com.banco.enums.Tipo;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Table(name="transferencia")
@Entity(name="transferencia")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transferencia implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="data_transferencia", nullable = false)
    private LocalDate dataTransferencia;

    @Column(name="valor", nullable = false, precision = 20, scale = 2)
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo", nullable = false,length = 15)
    private Tipo tipo;

    @Column(name="nome_operador_transacao", length = 50)
    private String nomeOperadorTransacao;

    @Column(name = "conta_id", nullable = false)
    private Integer conta_id;
}
