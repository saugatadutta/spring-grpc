package com.example.grpc.service;

import com.example.grpc.objects.GreetServiceGrpc.GreetServiceImplBase;
import com.example.grpc.objects.Messages;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class GreetService extends GreetServiceImplBase {
    @Override
    public void sayHello(Messages.GreetRequest request,
            StreamObserver<Messages.GreetReply> responseObserver) {
        final Messages.GreetReply.Builder replyBuilder =
                Messages.GreetReply.newBuilder().setName("Hello " + request.getName());
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
    }
}
