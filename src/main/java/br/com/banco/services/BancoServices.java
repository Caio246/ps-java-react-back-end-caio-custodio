package br.com.banco.services;

import br.com.banco.entities.Transferencia;
import br.com.banco.repository.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoServices {

    final BancoRepository bancoRepository;

    @Autowired
    public BancoServices(BancoRepository bancoRepository) {

        this.bancoRepository = bancoRepository;
    }

    public List<Transferencia> findAll(){
        return bancoRepository.findAll();
    }

//    @RequestMapping("/transferencias")
//    public ResponseEntity getAllContas(){
//
//        var retornarTodasAsContas = bancoRepository.findAll();
//
//        return ResponseEntity.ok(retornarTodasAsContas);
//    }
//
//    @RequestMapping("/transferenciass")
//    public List<TransferenciaResponseDTO> getAll() {
//        List<TransferenciaResponseDTO> tranferenciaList = bancoRepository.findAll().stream().map(TransferenciaResponseDTO::new).toList();
//        return tranferenciaList;
//    }
//
//    @RequestMapping( "/transferenciadata")
//    public ResponseEntity<List<Transferencia>> getTransferenciaByPeriod(@RequestParam("dataTransferencia") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime dataTransferencia) {
//        List<Transferencia> transferencias = bancoRepository.findAllByPeriodo(dataTransferencia);
//        return ResponseEntity.ok(transferencias);
//    }

}
