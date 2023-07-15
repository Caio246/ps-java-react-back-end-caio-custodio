package br.com.banco.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Table(name="conta")
@Entity(name="conta")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConta;

    @Column(name="nome_responsavel", nullable = false, length = 50)
    private String nomeResponsavel;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conta_id")
    private List<Transferencia> transferencia;

}
