# Spring Data ElasticSearch MVP

This project is a Spring Boot application that demonstrates how to use Spring Data ElasticSearch to interact with an
ElasticSearch instance.

## Prerequisites

- Java 21
- Maven 3.8.4
- Docker 20.10.8
- Docker Compose 1.29.2

## Getting Started

Run the following command to fire up the ElasticSearch and Kibana:

```shell
docker-compose up
```

Check the status of the ElasticSearch and Kibana by visiting the following URLs:

- [http://localhost:9200](http://localhost:9200)
- [http://localhost:5601](http://localhost:5601)

Run the following command to start the Spring Boot application:

```shell
mvn spring-boot:run
```

Visit the following URL to access the Swagger UI:

- [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
