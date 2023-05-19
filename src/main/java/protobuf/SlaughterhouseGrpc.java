package protobuf;

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
  private static volatile io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.ProductListRequest,
      protobuf.SlaughterhouseOuterClass.ProductListResponse> getGetProductsByAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsByAnimal",
      requestType = protobuf.SlaughterhouseOuterClass.ProductListRequest.class,
      responseType = protobuf.SlaughterhouseOuterClass.ProductListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.ProductListRequest,
      protobuf.SlaughterhouseOuterClass.ProductListResponse> getGetProductsByAnimalMethod() {
    io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.ProductListRequest, protobuf.SlaughterhouseOuterClass.ProductListResponse> getGetProductsByAnimalMethod;
    if ((getGetProductsByAnimalMethod = SlaughterhouseGrpc.getGetProductsByAnimalMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetProductsByAnimalMethod = SlaughterhouseGrpc.getGetProductsByAnimalMethod) == null) {
          SlaughterhouseGrpc.getGetProductsByAnimalMethod = getGetProductsByAnimalMethod =
              io.grpc.MethodDescriptor.<protobuf.SlaughterhouseOuterClass.ProductListRequest, protobuf.SlaughterhouseOuterClass.ProductListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsByAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.ProductListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.ProductListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("GetProductsByAnimal"))
              .build();
        }
      }
    }
    return getGetProductsByAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.ProductId,
      protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetByProductIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByProductId",
      requestType = protobuf.SlaughterhouseOuterClass.ProductId.class,
      responseType = protobuf.SlaughterhouseOuterClass.AllAnimalsMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.ProductId,
      protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetByProductIdMethod() {
    io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.ProductId, protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetByProductIdMethod;
    if ((getGetByProductIdMethod = SlaughterhouseGrpc.getGetByProductIdMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetByProductIdMethod = SlaughterhouseGrpc.getGetByProductIdMethod) == null) {
          SlaughterhouseGrpc.getGetByProductIdMethod = getGetByProductIdMethod =
              io.grpc.MethodDescriptor.<protobuf.SlaughterhouseOuterClass.ProductId, protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByProductId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.AllAnimalsMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("GetByProductId"))
              .build();
        }
      }
    }
    return getGetByProductIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.emptyMessage,
      protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetAllRegisteredMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllRegistered",
      requestType = protobuf.SlaughterhouseOuterClass.emptyMessage.class,
      responseType = protobuf.SlaughterhouseOuterClass.AllAnimalsMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.emptyMessage,
      protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetAllRegisteredMethod() {
    io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.emptyMessage, protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetAllRegisteredMethod;
    if ((getGetAllRegisteredMethod = SlaughterhouseGrpc.getGetAllRegisteredMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetAllRegisteredMethod = SlaughterhouseGrpc.getGetAllRegisteredMethod) == null) {
          SlaughterhouseGrpc.getGetAllRegisteredMethod = getGetAllRegisteredMethod =
              io.grpc.MethodDescriptor.<protobuf.SlaughterhouseOuterClass.emptyMessage, protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllRegistered"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.emptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.AllAnimalsMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("GetAllRegistered"))
              .build();
        }
      }
    }
    return getGetAllRegisteredMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Date,
      protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByDate",
      requestType = protobuf.SlaughterhouseOuterClass.Date.class,
      responseType = protobuf.SlaughterhouseOuterClass.AllAnimalsMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Date,
      protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetByDateMethod() {
    io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Date, protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetByDateMethod;
    if ((getGetByDateMethod = SlaughterhouseGrpc.getGetByDateMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetByDateMethod = SlaughterhouseGrpc.getGetByDateMethod) == null) {
          SlaughterhouseGrpc.getGetByDateMethod = getGetByDateMethod =
              io.grpc.MethodDescriptor.<protobuf.SlaughterhouseOuterClass.Date, protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.Date.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.AllAnimalsMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("GetByDate"))
              .build();
        }
      }
    }
    return getGetByDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.RegNum,
      protobuf.SlaughterhouseOuterClass.Animal> getGetByRegNumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByRegNum",
      requestType = protobuf.SlaughterhouseOuterClass.RegNum.class,
      responseType = protobuf.SlaughterhouseOuterClass.Animal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.RegNum,
      protobuf.SlaughterhouseOuterClass.Animal> getGetByRegNumMethod() {
    io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.RegNum, protobuf.SlaughterhouseOuterClass.Animal> getGetByRegNumMethod;
    if ((getGetByRegNumMethod = SlaughterhouseGrpc.getGetByRegNumMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetByRegNumMethod = SlaughterhouseGrpc.getGetByRegNumMethod) == null) {
          SlaughterhouseGrpc.getGetByRegNumMethod = getGetByRegNumMethod =
              io.grpc.MethodDescriptor.<protobuf.SlaughterhouseOuterClass.RegNum, protobuf.SlaughterhouseOuterClass.Animal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByRegNum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.RegNum.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.Animal.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("GetByRegNum"))
              .build();
        }
      }
    }
    return getGetByRegNumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Farm,
      protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetByOriginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByOrigin",
      requestType = protobuf.SlaughterhouseOuterClass.Farm.class,
      responseType = protobuf.SlaughterhouseOuterClass.AllAnimalsMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Farm,
      protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetByOriginMethod() {
    io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Farm, protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getGetByOriginMethod;
    if ((getGetByOriginMethod = SlaughterhouseGrpc.getGetByOriginMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetByOriginMethod = SlaughterhouseGrpc.getGetByOriginMethod) == null) {
          SlaughterhouseGrpc.getGetByOriginMethod = getGetByOriginMethod =
              io.grpc.MethodDescriptor.<protobuf.SlaughterhouseOuterClass.Farm, protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByOrigin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.Farm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.AllAnimalsMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("GetByOrigin"))
              .build();
        }
      }
    }
    return getGetByOriginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Animal,
      protobuf.SlaughterhouseOuterClass.boolResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = protobuf.SlaughterhouseOuterClass.Animal.class,
      responseType = protobuf.SlaughterhouseOuterClass.boolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Animal,
      protobuf.SlaughterhouseOuterClass.boolResponse> getAddMethod() {
    io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Animal, protobuf.SlaughterhouseOuterClass.boolResponse> getAddMethod;
    if ((getAddMethod = SlaughterhouseGrpc.getAddMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getAddMethod = SlaughterhouseGrpc.getAddMethod) == null) {
          SlaughterhouseGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<protobuf.SlaughterhouseOuterClass.Animal, protobuf.SlaughterhouseOuterClass.boolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.Animal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.boolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Animal,
      protobuf.SlaughterhouseOuterClass.boolResponse> getChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Change",
      requestType = protobuf.SlaughterhouseOuterClass.Animal.class,
      responseType = protobuf.SlaughterhouseOuterClass.boolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Animal,
      protobuf.SlaughterhouseOuterClass.boolResponse> getChangeMethod() {
    io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.Animal, protobuf.SlaughterhouseOuterClass.boolResponse> getChangeMethod;
    if ((getChangeMethod = SlaughterhouseGrpc.getChangeMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getChangeMethod = SlaughterhouseGrpc.getChangeMethod) == null) {
          SlaughterhouseGrpc.getChangeMethod = getChangeMethod =
              io.grpc.MethodDescriptor.<protobuf.SlaughterhouseOuterClass.Animal, protobuf.SlaughterhouseOuterClass.boolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Change"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.Animal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.boolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("Change"))
              .build();
        }
      }
    }
    return getChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.RegNum,
      protobuf.SlaughterhouseOuterClass.boolResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = protobuf.SlaughterhouseOuterClass.RegNum.class,
      responseType = protobuf.SlaughterhouseOuterClass.boolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.RegNum,
      protobuf.SlaughterhouseOuterClass.boolResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<protobuf.SlaughterhouseOuterClass.RegNum, protobuf.SlaughterhouseOuterClass.boolResponse> getRemoveMethod;
    if ((getRemoveMethod = SlaughterhouseGrpc.getRemoveMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getRemoveMethod = SlaughterhouseGrpc.getRemoveMethod) == null) {
          SlaughterhouseGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<protobuf.SlaughterhouseOuterClass.RegNum, protobuf.SlaughterhouseOuterClass.boolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.RegNum.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protobuf.SlaughterhouseOuterClass.boolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
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
    public void getProductsByAnimal(protobuf.SlaughterhouseOuterClass.ProductListRequest request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.ProductListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsByAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getByProductId(protobuf.SlaughterhouseOuterClass.ProductId request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByProductIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllRegistered(protobuf.SlaughterhouseOuterClass.emptyMessage request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllRegisteredMethod(), responseObserver);
    }

    /**
     */
    public void getByDate(protobuf.SlaughterhouseOuterClass.Date request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByDateMethod(), responseObserver);
    }

    /**
     */
    public void getByRegNum(protobuf.SlaughterhouseOuterClass.RegNum request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.Animal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByRegNumMethod(), responseObserver);
    }

    /**
     */
    public void getByOrigin(protobuf.SlaughterhouseOuterClass.Farm request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByOriginMethod(), responseObserver);
    }

    /**
     */
    public void add(protobuf.SlaughterhouseOuterClass.Animal request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.boolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void change(protobuf.SlaughterhouseOuterClass.Animal request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.boolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeMethod(), responseObserver);
    }

    /**
     */
    public void remove(protobuf.SlaughterhouseOuterClass.RegNum request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.boolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductsByAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protobuf.SlaughterhouseOuterClass.ProductListRequest,
                protobuf.SlaughterhouseOuterClass.ProductListResponse>(
                  this, METHODID_GET_PRODUCTS_BY_ANIMAL)))
          .addMethod(
            getGetByProductIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protobuf.SlaughterhouseOuterClass.ProductId,
                protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>(
                  this, METHODID_GET_BY_PRODUCT_ID)))
          .addMethod(
            getGetAllRegisteredMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protobuf.SlaughterhouseOuterClass.emptyMessage,
                protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>(
                  this, METHODID_GET_ALL_REGISTERED)))
          .addMethod(
            getGetByDateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protobuf.SlaughterhouseOuterClass.Date,
                protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>(
                  this, METHODID_GET_BY_DATE)))
          .addMethod(
            getGetByRegNumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protobuf.SlaughterhouseOuterClass.RegNum,
                protobuf.SlaughterhouseOuterClass.Animal>(
                  this, METHODID_GET_BY_REG_NUM)))
          .addMethod(
            getGetByOriginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protobuf.SlaughterhouseOuterClass.Farm,
                protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>(
                  this, METHODID_GET_BY_ORIGIN)))
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protobuf.SlaughterhouseOuterClass.Animal,
                protobuf.SlaughterhouseOuterClass.boolResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getChangeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protobuf.SlaughterhouseOuterClass.Animal,
                protobuf.SlaughterhouseOuterClass.boolResponse>(
                  this, METHODID_CHANGE)))
          .addMethod(
            getRemoveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                protobuf.SlaughterhouseOuterClass.RegNum,
                protobuf.SlaughterhouseOuterClass.boolResponse>(
                  this, METHODID_REMOVE)))
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
    public void getProductsByAnimal(protobuf.SlaughterhouseOuterClass.ProductListRequest request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.ProductListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsByAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByProductId(protobuf.SlaughterhouseOuterClass.ProductId request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByProductIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllRegistered(protobuf.SlaughterhouseOuterClass.emptyMessage request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllRegisteredMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByDate(protobuf.SlaughterhouseOuterClass.Date request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByRegNum(protobuf.SlaughterhouseOuterClass.RegNum request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.Animal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByRegNumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByOrigin(protobuf.SlaughterhouseOuterClass.Farm request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByOriginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(protobuf.SlaughterhouseOuterClass.Animal request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.boolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void change(protobuf.SlaughterhouseOuterClass.Animal request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.boolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void remove(protobuf.SlaughterhouseOuterClass.RegNum request,
        io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.boolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
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
    public protobuf.SlaughterhouseOuterClass.ProductListResponse getProductsByAnimal(protobuf.SlaughterhouseOuterClass.ProductListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsByAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public protobuf.SlaughterhouseOuterClass.AllAnimalsMessage getByProductId(protobuf.SlaughterhouseOuterClass.ProductId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByProductIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public protobuf.SlaughterhouseOuterClass.AllAnimalsMessage getAllRegistered(protobuf.SlaughterhouseOuterClass.emptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllRegisteredMethod(), getCallOptions(), request);
    }

    /**
     */
    public protobuf.SlaughterhouseOuterClass.AllAnimalsMessage getByDate(protobuf.SlaughterhouseOuterClass.Date request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public protobuf.SlaughterhouseOuterClass.Animal getByRegNum(protobuf.SlaughterhouseOuterClass.RegNum request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByRegNumMethod(), getCallOptions(), request);
    }

    /**
     */
    public protobuf.SlaughterhouseOuterClass.AllAnimalsMessage getByOrigin(protobuf.SlaughterhouseOuterClass.Farm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByOriginMethod(), getCallOptions(), request);
    }

    /**
     */
    public protobuf.SlaughterhouseOuterClass.boolResponse add(protobuf.SlaughterhouseOuterClass.Animal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public protobuf.SlaughterhouseOuterClass.boolResponse change(protobuf.SlaughterhouseOuterClass.Animal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public protobuf.SlaughterhouseOuterClass.boolResponse remove(protobuf.SlaughterhouseOuterClass.RegNum request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<protobuf.SlaughterhouseOuterClass.ProductListResponse> getProductsByAnimal(
        protobuf.SlaughterhouseOuterClass.ProductListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsByAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getByProductId(
        protobuf.SlaughterhouseOuterClass.ProductId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByProductIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getAllRegistered(
        protobuf.SlaughterhouseOuterClass.emptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllRegisteredMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getByDate(
        protobuf.SlaughterhouseOuterClass.Date request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByDateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protobuf.SlaughterhouseOuterClass.Animal> getByRegNum(
        protobuf.SlaughterhouseOuterClass.RegNum request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByRegNumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage> getByOrigin(
        protobuf.SlaughterhouseOuterClass.Farm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByOriginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protobuf.SlaughterhouseOuterClass.boolResponse> add(
        protobuf.SlaughterhouseOuterClass.Animal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protobuf.SlaughterhouseOuterClass.boolResponse> change(
        protobuf.SlaughterhouseOuterClass.Animal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protobuf.SlaughterhouseOuterClass.boolResponse> remove(
        protobuf.SlaughterhouseOuterClass.RegNum request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS_BY_ANIMAL = 0;
  private static final int METHODID_GET_BY_PRODUCT_ID = 1;
  private static final int METHODID_GET_ALL_REGISTERED = 2;
  private static final int METHODID_GET_BY_DATE = 3;
  private static final int METHODID_GET_BY_REG_NUM = 4;
  private static final int METHODID_GET_BY_ORIGIN = 5;
  private static final int METHODID_ADD = 6;
  private static final int METHODID_CHANGE = 7;
  private static final int METHODID_REMOVE = 8;

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
          serviceImpl.getProductsByAnimal((protobuf.SlaughterhouseOuterClass.ProductListRequest) request,
              (io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.ProductListResponse>) responseObserver);
          break;
        case METHODID_GET_BY_PRODUCT_ID:
          serviceImpl.getByProductId((protobuf.SlaughterhouseOuterClass.ProductId) request,
              (io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>) responseObserver);
          break;
        case METHODID_GET_ALL_REGISTERED:
          serviceImpl.getAllRegistered((protobuf.SlaughterhouseOuterClass.emptyMessage) request,
              (io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>) responseObserver);
          break;
        case METHODID_GET_BY_DATE:
          serviceImpl.getByDate((protobuf.SlaughterhouseOuterClass.Date) request,
              (io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>) responseObserver);
          break;
        case METHODID_GET_BY_REG_NUM:
          serviceImpl.getByRegNum((protobuf.SlaughterhouseOuterClass.RegNum) request,
              (io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.Animal>) responseObserver);
          break;
        case METHODID_GET_BY_ORIGIN:
          serviceImpl.getByOrigin((protobuf.SlaughterhouseOuterClass.Farm) request,
              (io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.AllAnimalsMessage>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((protobuf.SlaughterhouseOuterClass.Animal) request,
              (io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.boolResponse>) responseObserver);
          break;
        case METHODID_CHANGE:
          serviceImpl.change((protobuf.SlaughterhouseOuterClass.Animal) request,
              (io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.boolResponse>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((protobuf.SlaughterhouseOuterClass.RegNum) request,
              (io.grpc.stub.StreamObserver<protobuf.SlaughterhouseOuterClass.boolResponse>) responseObserver);
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
      return protobuf.SlaughterhouseOuterClass.getDescriptor();
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
              .addMethod(getGetByProductIdMethod())
              .addMethod(getGetAllRegisteredMethod())
              .addMethod(getGetByDateMethod())
              .addMethod(getGetByRegNumMethod())
              .addMethod(getGetByOriginMethod())
              .addMethod(getAddMethod())
              .addMethod(getChangeMethod())
              .addMethod(getRemoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
