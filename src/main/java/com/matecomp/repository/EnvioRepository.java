package com.matecomp.repository;

import com.matecomp.modelo.Envio;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface EnvioRepository extends ReactiveCrudRepository<Envio, Integer> {

    @Query("select * from envios where estado='pendiente'")
    Flux<Envio> findByPendientes();
}
