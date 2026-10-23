package com.matecomp.service;

import com.matecomp.modelo.Envio;
import com.matecomp.repository.EnvioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class EnviosServiceImpl implements EnviosService {

    private final EnvioRepository envioRepository;

    @Override
    public Flux<Envio> pendientes() {
        return envioRepository.findByPendientes();
    }

    //se asigna otro grupo porque cuansdo se publique si tienen el mismo grupo se van a repartir el consumo
    // y lo que queremos es que los consuman los 2 por aparte tanto el gestion de stock como este de envios de productso
    @KafkaListener(topics = "orders",  groupId = "group2")
    public void gestionEnvios(Envio envio) {
        envio.setFecha(LocalDateTime.now());
        envio.setEstado("pendiente");
        envioRepository.save(envio).subscribe();
    }
}
