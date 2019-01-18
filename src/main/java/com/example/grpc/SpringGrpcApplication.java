package com.example.grpc;

import com.example.grpc.service.GreetService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringGrpcApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(SpringGrpcApplication.class,
                args);
        /*Server server = ServerBuilder
                .forPort(8080)
                .addService(new GreetService()).build();

        server.start();
        server.awaitTermination();*/
    }

}

