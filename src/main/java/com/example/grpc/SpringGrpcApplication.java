package com.example.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGrpcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGrpcApplication.class,
                args);
        /*Server server = ServerBuilder
                .forPort(8080)
                .addService(new GreetService()).build();

        server.start();
        server.awaitTermination();*/
    }

}

