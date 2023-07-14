package br.com.banco.dto;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class TransferenciaResponseDTO {

    @NotBlank
    private Date dataTransferencia;

    @NotBlank
    private BigDecimal valor;

    @NotBlank
    @Size(max = 15)
    private String tipo;

    @NotBlank
    @Size(max = 50)
    private String nomeOperadorTransacao;
}