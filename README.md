# 📦 Proyecto de enrolamiento de alumnos 

Este proyecto  es un cosumidor que reduce el stock de los productos tomando le mensaje de kafka y aplicandolo en la BD

---

## 🚀 Tecnologías y herramientas

- Java 21
- Spring Boot 4.x
- R2DBC recatico con mysql
- Maven 
- Base de datos: Mysql 
- Otros: KAFKA

---

## 🧩 Arquitectura

Describe brevemente la estructura del proyecto:
- `controller/`: Exposición de endpoints con funtional endpoints y no con @REST
- `service/`: Lógica de negocio
- `repo/`: Acceso a datos con R2DBC q no es lo mismo que JPA
- `model/`: Mapeo de entidades R2DBC q no es lo mismo que JPA
- `config/`: Configuraciones generales (mappers.)

---

## 📄 Endpoints principales
API:

| Método | Endpoint | Parámetros | Descripción | Respuesta |
|---------|----------|------------|-------------|-----------|
| GET | `api/v1/envios` | Ninguno | Obtiene los envios pendientes | `Flux<Envio>` |



## 🧪 Ejecución y pruebas de la Imagen del backend


# Levantar proyecto con IDE 
- java -jar target/15_microservicio_envios-0.0.1-SNAPSHOT.jar
- genera la data con el script dentro del fil bddump


 

# Prueba

## 🧪 Levantar el proyecto y desde el productor registar el mensaje en Kafka para que este micro haga elconsumo lanzando la petición desde postman
## consultar los envios pendientes desde postman adjunto al sistema o desde un bash
curl --location 'localhost:8001/api/v1/envios'



