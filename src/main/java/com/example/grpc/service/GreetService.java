package com.example.grpc.service;

import com.example.grpc.entity.SampleEntity;
import com.example.grpc.objects.GreetServiceGrpc.GreetServiceImplBase;
import com.example.grpc.objects.Messages;
import com.example.grpc.repo.GreetRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class GreetService extends GreetServiceImplBase {

    @Autowired
    GreetRepository greetRepository;

    @Override
    public void sayHello(Messages.GreetRequest request,
            StreamObserver<Messages.GreetReply> responseObserver) {
        SampleEntity sampleEntity = greetRepository.findById(request.getId()).get();
        final Messages.GreetReply.Builder replyBuilder =
                Messages.GreetReply.newBuilder().setId(sampleEntity.getId()).setFirstName(sampleEntity.getFirstName()).setLastName(sampleEntity.getLastName()).setCountry(sampleEntity.getCountry());
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
    }
}
