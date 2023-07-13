package br.com.banco.service;

import br.com.banco.repository.DadosTransferencia;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BancoService {

    private Map<String, DadosTransferencia> dadosTransferencia;

}
