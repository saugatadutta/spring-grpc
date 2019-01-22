package com.example.grpc.controller;

import com.example.grpc.entity.SampleEntity;
import com.example.grpc.repo.GreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    GreetRepository greetRepository;


    @GetMapping(value = "/sayhello")
    public SampleEntity sayHello(@RequestParam String id) {
        SampleEntity sampleEntity = greetRepository.findById(id).get();
        return sampleEntity;
    }
}