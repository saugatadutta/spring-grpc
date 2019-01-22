package com.example.grpc.repo;

import com.example.grpc.entity.SampleEntity;
import org.springframework.data.repository.CrudRepository;

public interface GreetRepository extends CrudRepository<SampleEntity,String>{
}
