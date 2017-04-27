// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: load_balancer.proto

package io.grpc.grpclb;

/**
 * Protobuf type {@code grpc.lb.v1.InitialLoadBalanceResponse}
 */
public  final class InitialLoadBalanceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.lb.v1.InitialLoadBalanceResponse)
    InitialLoadBalanceResponseOrBuilder {
  // Use InitialLoadBalanceResponse.newBuilder() to construct.
  private InitialLoadBalanceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InitialLoadBalanceResponse() {
    loadBalancerDelegate_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private InitialLoadBalanceResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            loadBalancerDelegate_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (clientStatsReportInterval_ != null) {
              subBuilder = clientStatsReportInterval_.toBuilder();
            }
            clientStatsReportInterval_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clientStatsReportInterval_);
              clientStatsReportInterval_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.grpclb.LoadBalancerProto.internal_static_grpc_lb_v1_InitialLoadBalanceResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.grpclb.LoadBalancerProto.internal_static_grpc_lb_v1_InitialLoadBalanceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.grpclb.InitialLoadBalanceResponse.class, io.grpc.grpclb.InitialLoadBalanceResponse.Builder.class);
  }

  public static final int LOAD_BALANCER_DELEGATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object loadBalancerDelegate_;
  /**
   * <pre>
   * This is an application layer redirect that indicates the client should use
   * the specified server for load balancing. When this field is non-empty in
   * the response, the client should open a separate connection to the
   * load_balancer_delegate and call the BalanceLoad method. Its length should
   * be less than 64 bytes.
   * </pre>
   *
   * <code>string load_balancer_delegate = 1;</code>
   */
  public java.lang.String getLoadBalancerDelegate() {
    java.lang.Object ref = loadBalancerDelegate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      loadBalancerDelegate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * This is an application layer redirect that indicates the client should use
   * the specified server for load balancing. When this field is non-empty in
   * the response, the client should open a separate connection to the
   * load_balancer_delegate and call the BalanceLoad method. Its length should
   * be less than 64 bytes.
   * </pre>
   *
   * <code>string load_balancer_delegate = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLoadBalancerDelegateBytes() {
    java.lang.Object ref = loadBalancerDelegate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      loadBalancerDelegate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_STATS_REPORT_INTERVAL_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration clientStatsReportInterval_;
  /**
   * <pre>
   * This interval defines how often the client should send the client stats
   * to the load balancer. Stats should only be reported when the duration is
   * positive.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
   */
  public boolean hasClientStatsReportInterval() {
    return clientStatsReportInterval_ != null;
  }
  /**
   * <pre>
   * This interval defines how often the client should send the client stats
   * to the load balancer. Stats should only be reported when the duration is
   * positive.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
   */
  public com.google.protobuf.Duration getClientStatsReportInterval() {
    return clientStatsReportInterval_ == null ? com.google.protobuf.Duration.getDefaultInstance() : clientStatsReportInterval_;
  }
  /**
   * <pre>
   * This interval defines how often the client should send the client stats
   * to the load balancer. Stats should only be reported when the duration is
   * positive.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
   */
  public com.google.protobuf.DurationOrBuilder getClientStatsReportIntervalOrBuilder() {
    return getClientStatsReportInterval();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getLoadBalancerDelegateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, loadBalancerDelegate_);
    }
    if (clientStatsReportInterval_ != null) {
      output.writeMessage(2, getClientStatsReportInterval());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLoadBalancerDelegateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, loadBalancerDelegate_);
    }
    if (clientStatsReportInterval_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getClientStatsReportInterval());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.grpclb.InitialLoadBalanceResponse)) {
      return super.equals(obj);
    }
    io.grpc.grpclb.InitialLoadBalanceResponse other = (io.grpc.grpclb.InitialLoadBalanceResponse) obj;

    boolean result = true;
    result = result && getLoadBalancerDelegate()
        .equals(other.getLoadBalancerDelegate());
    result = result && (hasClientStatsReportInterval() == other.hasClientStatsReportInterval());
    if (hasClientStatsReportInterval()) {
      result = result && getClientStatsReportInterval()
          .equals(other.getClientStatsReportInterval());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LOAD_BALANCER_DELEGATE_FIELD_NUMBER;
    hash = (53 * hash) + getLoadBalancerDelegate().hashCode();
    if (hasClientStatsReportInterval()) {
      hash = (37 * hash) + CLIENT_STATS_REPORT_INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getClientStatsReportInterval().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.grpclb.InitialLoadBalanceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.grpclb.InitialLoadBalanceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.grpclb.InitialLoadBalanceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.grpclb.InitialLoadBalanceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.grpclb.InitialLoadBalanceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.grpclb.InitialLoadBalanceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.grpclb.InitialLoadBalanceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.grpclb.InitialLoadBalanceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.grpclb.InitialLoadBalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.grpclb.InitialLoadBalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.grpclb.InitialLoadBalanceResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.lb.v1.InitialLoadBalanceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.lb.v1.InitialLoadBalanceResponse)
      io.grpc.grpclb.InitialLoadBalanceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.grpclb.LoadBalancerProto.internal_static_grpc_lb_v1_InitialLoadBalanceResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.grpclb.LoadBalancerProto.internal_static_grpc_lb_v1_InitialLoadBalanceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.grpclb.InitialLoadBalanceResponse.class, io.grpc.grpclb.InitialLoadBalanceResponse.Builder.class);
    }

    // Construct using io.grpc.grpclb.InitialLoadBalanceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      loadBalancerDelegate_ = "";

      if (clientStatsReportIntervalBuilder_ == null) {
        clientStatsReportInterval_ = null;
      } else {
        clientStatsReportInterval_ = null;
        clientStatsReportIntervalBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.grpclb.LoadBalancerProto.internal_static_grpc_lb_v1_InitialLoadBalanceResponse_descriptor;
    }

    public io.grpc.grpclb.InitialLoadBalanceResponse getDefaultInstanceForType() {
      return io.grpc.grpclb.InitialLoadBalanceResponse.getDefaultInstance();
    }

    public io.grpc.grpclb.InitialLoadBalanceResponse build() {
      io.grpc.grpclb.InitialLoadBalanceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.grpclb.InitialLoadBalanceResponse buildPartial() {
      io.grpc.grpclb.InitialLoadBalanceResponse result = new io.grpc.grpclb.InitialLoadBalanceResponse(this);
      result.loadBalancerDelegate_ = loadBalancerDelegate_;
      if (clientStatsReportIntervalBuilder_ == null) {
        result.clientStatsReportInterval_ = clientStatsReportInterval_;
      } else {
        result.clientStatsReportInterval_ = clientStatsReportIntervalBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.grpclb.InitialLoadBalanceResponse) {
        return mergeFrom((io.grpc.grpclb.InitialLoadBalanceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.grpclb.InitialLoadBalanceResponse other) {
      if (other == io.grpc.grpclb.InitialLoadBalanceResponse.getDefaultInstance()) return this;
      if (!other.getLoadBalancerDelegate().isEmpty()) {
        loadBalancerDelegate_ = other.loadBalancerDelegate_;
        onChanged();
      }
      if (other.hasClientStatsReportInterval()) {
        mergeClientStatsReportInterval(other.getClientStatsReportInterval());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.grpclb.InitialLoadBalanceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.grpclb.InitialLoadBalanceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object loadBalancerDelegate_ = "";
    /**
     * <pre>
     * This is an application layer redirect that indicates the client should use
     * the specified server for load balancing. When this field is non-empty in
     * the response, the client should open a separate connection to the
     * load_balancer_delegate and call the BalanceLoad method. Its length should
     * be less than 64 bytes.
     * </pre>
     *
     * <code>string load_balancer_delegate = 1;</code>
     */
    public java.lang.String getLoadBalancerDelegate() {
      java.lang.Object ref = loadBalancerDelegate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        loadBalancerDelegate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * This is an application layer redirect that indicates the client should use
     * the specified server for load balancing. When this field is non-empty in
     * the response, the client should open a separate connection to the
     * load_balancer_delegate and call the BalanceLoad method. Its length should
     * be less than 64 bytes.
     * </pre>
     *
     * <code>string load_balancer_delegate = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLoadBalancerDelegateBytes() {
      java.lang.Object ref = loadBalancerDelegate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        loadBalancerDelegate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * This is an application layer redirect that indicates the client should use
     * the specified server for load balancing. When this field is non-empty in
     * the response, the client should open a separate connection to the
     * load_balancer_delegate and call the BalanceLoad method. Its length should
     * be less than 64 bytes.
     * </pre>
     *
     * <code>string load_balancer_delegate = 1;</code>
     */
    public Builder setLoadBalancerDelegate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      loadBalancerDelegate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is an application layer redirect that indicates the client should use
     * the specified server for load balancing. When this field is non-empty in
     * the response, the client should open a separate connection to the
     * load_balancer_delegate and call the BalanceLoad method. Its length should
     * be less than 64 bytes.
     * </pre>
     *
     * <code>string load_balancer_delegate = 1;</code>
     */
    public Builder clearLoadBalancerDelegate() {
      
      loadBalancerDelegate_ = getDefaultInstance().getLoadBalancerDelegate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is an application layer redirect that indicates the client should use
     * the specified server for load balancing. When this field is non-empty in
     * the response, the client should open a separate connection to the
     * load_balancer_delegate and call the BalanceLoad method. Its length should
     * be less than 64 bytes.
     * </pre>
     *
     * <code>string load_balancer_delegate = 1;</code>
     */
    public Builder setLoadBalancerDelegateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      loadBalancerDelegate_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration clientStatsReportInterval_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> clientStatsReportIntervalBuilder_;
    /**
     * <pre>
     * This interval defines how often the client should send the client stats
     * to the load balancer. Stats should only be reported when the duration is
     * positive.
     * </pre>
     *
     * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
     */
    public boolean hasClientStatsReportInterval() {
      return clientStatsReportIntervalBuilder_ != null || clientStatsReportInterval_ != null;
    }
    /**
     * <pre>
     * This interval defines how often the client should send the client stats
     * to the load balancer. Stats should only be reported when the duration is
     * positive.
     * </pre>
     *
     * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
     */
    public com.google.protobuf.Duration getClientStatsReportInterval() {
      if (clientStatsReportIntervalBuilder_ == null) {
        return clientStatsReportInterval_ == null ? com.google.protobuf.Duration.getDefaultInstance() : clientStatsReportInterval_;
      } else {
        return clientStatsReportIntervalBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This interval defines how often the client should send the client stats
     * to the load balancer. Stats should only be reported when the duration is
     * positive.
     * </pre>
     *
     * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
     */
    public Builder setClientStatsReportInterval(com.google.protobuf.Duration value) {
      if (clientStatsReportIntervalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientStatsReportInterval_ = value;
        onChanged();
      } else {
        clientStatsReportIntervalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * This interval defines how often the client should send the client stats
     * to the load balancer. Stats should only be reported when the duration is
     * positive.
     * </pre>
     *
     * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
     */
    public Builder setClientStatsReportInterval(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (clientStatsReportIntervalBuilder_ == null) {
        clientStatsReportInterval_ = builderForValue.build();
        onChanged();
      } else {
        clientStatsReportIntervalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * This interval defines how often the client should send the client stats
     * to the load balancer. Stats should only be reported when the duration is
     * positive.
     * </pre>
     *
     * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
     */
    public Builder mergeClientStatsReportInterval(com.google.protobuf.Duration value) {
      if (clientStatsReportIntervalBuilder_ == null) {
        if (clientStatsReportInterval_ != null) {
          clientStatsReportInterval_ =
            com.google.protobuf.Duration.newBuilder(clientStatsReportInterval_).mergeFrom(value).buildPartial();
        } else {
          clientStatsReportInterval_ = value;
        }
        onChanged();
      } else {
        clientStatsReportIntervalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * This interval defines how often the client should send the client stats
     * to the load balancer. Stats should only be reported when the duration is
     * positive.
     * </pre>
     *
     * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
     */
    public Builder clearClientStatsReportInterval() {
      if (clientStatsReportIntervalBuilder_ == null) {
        clientStatsReportInterval_ = null;
        onChanged();
      } else {
        clientStatsReportInterval_ = null;
        clientStatsReportIntervalBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * This interval defines how often the client should send the client stats
     * to the load balancer. Stats should only be reported when the duration is
     * positive.
     * </pre>
     *
     * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getClientStatsReportIntervalBuilder() {
      
      onChanged();
      return getClientStatsReportIntervalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This interval defines how often the client should send the client stats
     * to the load balancer. Stats should only be reported when the duration is
     * positive.
     * </pre>
     *
     * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getClientStatsReportIntervalOrBuilder() {
      if (clientStatsReportIntervalBuilder_ != null) {
        return clientStatsReportIntervalBuilder_.getMessageOrBuilder();
      } else {
        return clientStatsReportInterval_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : clientStatsReportInterval_;
      }
    }
    /**
     * <pre>
     * This interval defines how often the client should send the client stats
     * to the load balancer. Stats should only be reported when the duration is
     * positive.
     * </pre>
     *
     * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getClientStatsReportIntervalFieldBuilder() {
      if (clientStatsReportIntervalBuilder_ == null) {
        clientStatsReportIntervalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getClientStatsReportInterval(),
                getParentForChildren(),
                isClean());
        clientStatsReportInterval_ = null;
      }
      return clientStatsReportIntervalBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.lb.v1.InitialLoadBalanceResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.lb.v1.InitialLoadBalanceResponse)
  private static final io.grpc.grpclb.InitialLoadBalanceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.grpclb.InitialLoadBalanceResponse();
  }

  public static io.grpc.grpclb.InitialLoadBalanceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitialLoadBalanceResponse>
      PARSER = new com.google.protobuf.AbstractParser<InitialLoadBalanceResponse>() {
    public InitialLoadBalanceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InitialLoadBalanceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InitialLoadBalanceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitialLoadBalanceResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.grpclb.InitialLoadBalanceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

