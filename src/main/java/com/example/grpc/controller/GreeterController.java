package com.example.grpc.controller;

import com.example.grpc.objects.GreetServiceGrpc;
import com.example.grpc.objects.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @Autowired  // <===== gRPC stub is autowired!
    private GreetServiceGrpc.GreetServiceBlockingStub greeterStub;

    @RequestMapping(value = "/sayhello")
    public String sayHello(@RequestParam String name) {
        Messages.GreetRequest request = Messages.GreetRequest.newBuilder().setName(name).build();
        Messages.GreetReply reply = greeterStub.sayHello(request);
        return reply.getName();
    }
}