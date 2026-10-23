package com.matecomp.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(value = "envios")
public class Envio {

    @Id
    @Column("idEnvio")
    private Integer idEnvio;
    @JsonAlias(value = "name")//asi llega desde  el producto
    private String producto;
    private LocalDateTime fecha;
    @JsonAlias(value = "address")
    private String direccion;
    private String estado;
}
