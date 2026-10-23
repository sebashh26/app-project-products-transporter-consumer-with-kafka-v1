package com.matecomp.controller;

import com.matecomp.modelo.Envio;
import com.matecomp.service.EnviosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/envios")
public class EnviosController {

    private final EnviosService enviosService;

    @GetMapping
    public ResponseEntity<Flux<Envio>> enviosPendientes() {
        return new ResponseEntity<>(enviosService.pendientes(), HttpStatus.OK);
    }
}
