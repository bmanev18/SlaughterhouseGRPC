package com.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *That is the API
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: slaughterhouse.proto")
public final class SlaughterhouseGrpc {

  private SlaughterhouseGrpc() {}

  public static final String SERVICE_NAME = "Slaughterhouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.protobuf.SlaughterhouseOuterClass.ProductListRequest,
      com.protobuf.SlaughterhouseOuterClass.ProductListResponse> getGetProductsByAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsByAnimal",
      requestType = com.protobuf.SlaughterhouseOuterClass.ProductListRequest.class,
      responseType = com.protobuf.SlaughterhouseOuterClass.ProductListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.SlaughterhouseOuterClass.ProductListRequest,
      com.protobuf.SlaughterhouseOuterClass.ProductListResponse> getGetProductsByAnimalMethod() {
    io.grpc.MethodDescriptor<com.protobuf.SlaughterhouseOuterClass.ProductListRequest, com.protobuf.SlaughterhouseOuterClass.ProductListResponse> getGetProductsByAnimalMethod;
    if ((getGetProductsByAnimalMethod = SlaughterhouseGrpc.getGetProductsByAnimalMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetProductsByAnimalMethod = SlaughterhouseGrpc.getGetProductsByAnimalMethod) == null) {
          SlaughterhouseGrpc.getGetProductsByAnimalMethod = getGetProductsByAnimalMethod =
              io.grpc.MethodDescriptor.<com.protobuf.SlaughterhouseOuterClass.ProductListRequest, com.protobuf.SlaughterhouseOuterClass.ProductListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsByAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.SlaughterhouseOuterClass.ProductListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.SlaughterhouseOuterClass.ProductListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("GetProductsByAnimal"))
              .build();
        }
      }
    }
    return getGetProductsByAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.protobuf.SlaughterhouseOuterClass.AnimalListRequest,
      com.protobuf.SlaughterhouseOuterClass.AnimalListResponse> getGetAnimalsByProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimalsByProduct",
      requestType = com.protobuf.SlaughterhouseOuterClass.AnimalListRequest.class,
      responseType = com.protobuf.SlaughterhouseOuterClass.AnimalListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.protobuf.SlaughterhouseOuterClass.AnimalListRequest,
      com.protobuf.SlaughterhouseOuterClass.AnimalListResponse> getGetAnimalsByProductMethod() {
    io.grpc.MethodDescriptor<com.protobuf.SlaughterhouseOuterClass.AnimalListRequest, com.protobuf.SlaughterhouseOuterClass.AnimalListResponse> getGetAnimalsByProductMethod;
    if ((getGetAnimalsByProductMethod = SlaughterhouseGrpc.getGetAnimalsByProductMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetAnimalsByProductMethod = SlaughterhouseGrpc.getGetAnimalsByProductMethod) == null) {
          SlaughterhouseGrpc.getGetAnimalsByProductMethod = getGetAnimalsByProductMethod =
              io.grpc.MethodDescriptor.<com.protobuf.SlaughterhouseOuterClass.AnimalListRequest, com.protobuf.SlaughterhouseOuterClass.AnimalListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimalsByProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.SlaughterhouseOuterClass.AnimalListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.protobuf.SlaughterhouseOuterClass.AnimalListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("GetAnimalsByProduct"))
              .build();
        }
      }
    }
    return getGetAnimalsByProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterhouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseStub>() {
        @java.lang.Override
        public SlaughterhouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseStub(channel, callOptions);
        }
      };
    return SlaughterhouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterhouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseBlockingStub>() {
        @java.lang.Override
        public SlaughterhouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseBlockingStub(channel, callOptions);
        }
      };
    return SlaughterhouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterhouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseFutureStub>() {
        @java.lang.Override
        public SlaughterhouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseFutureStub(channel, callOptions);
        }
      };
    return SlaughterhouseFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *That is the API
   * </pre>
   */
  public static abstract class SlaughterhouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProductsByAnimal(com.protobuf.SlaughterhouseOuterClass.ProductListRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.SlaughterhouseOuterClass.ProductListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsByAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getAnimalsByProduct(com.protobuf.SlaughterhouseOuterClass.AnimalListRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.SlaughterhouseOuterClass.AnimalListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsByProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductsByAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.SlaughterhouseOuterClass.ProductListRequest,
                com.protobuf.SlaughterhouseOuterClass.ProductListResponse>(
                  this, METHODID_GET_PRODUCTS_BY_ANIMAL)))
          .addMethod(
            getGetAnimalsByProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.protobuf.SlaughterhouseOuterClass.AnimalListRequest,
                com.protobuf.SlaughterhouseOuterClass.AnimalListResponse>(
                  this, METHODID_GET_ANIMALS_BY_PRODUCT)))
          .build();
    }
  }

  /**
   * <pre>
   *That is the API
   * </pre>
   */
  public static final class SlaughterhouseStub extends io.grpc.stub.AbstractAsyncStub<SlaughterhouseStub> {
    private SlaughterhouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseStub(channel, callOptions);
    }

    /**
     */
    public void getProductsByAnimal(com.protobuf.SlaughterhouseOuterClass.ProductListRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.SlaughterhouseOuterClass.ProductListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsByAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalsByProduct(com.protobuf.SlaughterhouseOuterClass.AnimalListRequest request,
        io.grpc.stub.StreamObserver<com.protobuf.SlaughterhouseOuterClass.AnimalListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsByProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *That is the API
   * </pre>
   */
  public static final class SlaughterhouseBlockingStub extends io.grpc.stub.AbstractBlockingStub<SlaughterhouseBlockingStub> {
    private SlaughterhouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.protobuf.SlaughterhouseOuterClass.ProductListResponse getProductsByAnimal(com.protobuf.SlaughterhouseOuterClass.ProductListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsByAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.protobuf.SlaughterhouseOuterClass.AnimalListResponse getAnimalsByProduct(com.protobuf.SlaughterhouseOuterClass.AnimalListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsByProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *That is the API
   * </pre>
   */
  public static final class SlaughterhouseFutureStub extends io.grpc.stub.AbstractFutureStub<SlaughterhouseFutureStub> {
    private SlaughterhouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.SlaughterhouseOuterClass.ProductListResponse> getProductsByAnimal(
        com.protobuf.SlaughterhouseOuterClass.ProductListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsByAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.protobuf.SlaughterhouseOuterClass.AnimalListResponse> getAnimalsByProduct(
        com.protobuf.SlaughterhouseOuterClass.AnimalListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsByProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS_BY_ANIMAL = 0;
  private static final int METHODID_GET_ANIMALS_BY_PRODUCT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterhouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterhouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCTS_BY_ANIMAL:
          serviceImpl.getProductsByAnimal((com.protobuf.SlaughterhouseOuterClass.ProductListRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.SlaughterhouseOuterClass.ProductListResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMALS_BY_PRODUCT:
          serviceImpl.getAnimalsByProduct((com.protobuf.SlaughterhouseOuterClass.AnimalListRequest) request,
              (io.grpc.stub.StreamObserver<com.protobuf.SlaughterhouseOuterClass.AnimalListResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SlaughterhouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterhouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.protobuf.SlaughterhouseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Slaughterhouse");
    }
  }

  private static final class SlaughterhouseFileDescriptorSupplier
      extends SlaughterhouseBaseDescriptorSupplier {
    SlaughterhouseFileDescriptorSupplier() {}
  }

  private static final class SlaughterhouseMethodDescriptorSupplier
      extends SlaughterhouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlaughterhouseMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SlaughterhouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterhouseFileDescriptorSupplier())
              .addMethod(getGetProductsByAnimalMethod())
              .addMethod(getGetAnimalsByProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
