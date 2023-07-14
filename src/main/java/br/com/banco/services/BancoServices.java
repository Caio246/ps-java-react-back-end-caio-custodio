package br.com.banco.services;

import br.com.banco.entities.Transferencia;
import br.com.banco.repository.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BancoServices {

    BancoRepository bancoRepository;

    @Autowired
    public BancoServices(BancoRepository bancoRepository) {

        this.bancoRepository = bancoRepository;
    }

    @RequestMapping( "/transferenciadata")
    public ResponseEntity<List<Transferencia>> getTransferenciaByPeriod(@RequestParam("dataTransferencia") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime dataTransferencia) {
        List<Transferencia> transferencias = bancoRepository.findAllByPeriodo(dataTransferencia);
        return ResponseEntity.ok(transferencias);
    }

//    @GetMapping( "/transferenciadata")
//    public ResponseEntity<List<Transferencia>> getTransferenciaByPeriod(@RequestParam("dataTransferencia") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataTransferencia) {
//        List<Transferencia> transferencias = bancoRepository.findAllByPeriodo(dataTransferencia);
//        return ResponseEntity.ok(transferencias);
//    }

}
