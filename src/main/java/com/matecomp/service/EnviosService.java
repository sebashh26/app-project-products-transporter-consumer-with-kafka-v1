package com.matecomp.service;

import com.matecomp.modelo.Envio;
import reactor.core.publisher.Flux;

public interface EnviosService {

    Flux<Envio> pendientes();
}
