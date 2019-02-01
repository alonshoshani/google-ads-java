// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/customer_client_link_service.proto

package com.google.ads.googleads.v0.services;

/**
 * <pre>
 * Request message for [CustomerClientLinkService.MutateCustomerClientLink][google.ads.googleads.v0.services.CustomerClientLinkService.MutateCustomerClientLink].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.services.MutateCustomerClientLinkRequest}
 */
public  final class MutateCustomerClientLinkRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.services.MutateCustomerClientLinkRequest)
    MutateCustomerClientLinkRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCustomerClientLinkRequest.newBuilder() to construct.
  private MutateCustomerClientLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCustomerClientLinkRequest() {
    customerId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateCustomerClientLinkRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            customerId_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v0.services.CustomerClientLinkOperation.Builder subBuilder = null;
            if (operation_ != null) {
              subBuilder = operation_.toBuilder();
            }
            operation_ = input.readMessage(com.google.ads.googleads.v0.services.CustomerClientLinkOperation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operation_);
              operation_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v0.services.CustomerClientLinkServiceProto.internal_static_google_ads_googleads_v0_services_MutateCustomerClientLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.services.CustomerClientLinkServiceProto.internal_static_google_ads_googleads_v0_services_MutateCustomerClientLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest.class, com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerId_;
  /**
   * <pre>
   * The ID of the customer whose customer link are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the customer whose customer link are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATION_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v0.services.CustomerClientLinkOperation operation_;
  /**
   * <pre>
   * The operation to perform on the individual CustomerClientLink.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
   */
  public boolean hasOperation() {
    return operation_ != null;
  }
  /**
   * <pre>
   * The operation to perform on the individual CustomerClientLink.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
   */
  public com.google.ads.googleads.v0.services.CustomerClientLinkOperation getOperation() {
    return operation_ == null ? com.google.ads.googleads.v0.services.CustomerClientLinkOperation.getDefaultInstance() : operation_;
  }
  /**
   * <pre>
   * The operation to perform on the individual CustomerClientLink.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
   */
  public com.google.ads.googleads.v0.services.CustomerClientLinkOperationOrBuilder getOperationOrBuilder() {
    return getOperation();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCustomerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (operation_ != null) {
      output.writeMessage(2, getOperation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCustomerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (operation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOperation());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest other = (com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest) obj;

    boolean result = true;
    result = result && getCustomerId()
        .equals(other.getCustomerId());
    result = result && (hasOperation() == other.hasOperation());
    if (hasOperation()) {
      result = result && getOperation()
          .equals(other.getOperation());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    if (hasOperation()) {
      hash = (37 * hash) + OPERATION_FIELD_NUMBER;
      hash = (53 * hash) + getOperation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * Request message for [CustomerClientLinkService.MutateCustomerClientLink][google.ads.googleads.v0.services.CustomerClientLinkService.MutateCustomerClientLink].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.services.MutateCustomerClientLinkRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.services.MutateCustomerClientLinkRequest)
      com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.services.CustomerClientLinkServiceProto.internal_static_google_ads_googleads_v0_services_MutateCustomerClientLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.services.CustomerClientLinkServiceProto.internal_static_google_ads_googleads_v0_services_MutateCustomerClientLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest.class, com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      customerId_ = "";

      if (operationBuilder_ == null) {
        operation_ = null;
      } else {
        operation_ = null;
        operationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.services.CustomerClientLinkServiceProto.internal_static_google_ads_googleads_v0_services_MutateCustomerClientLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest build() {
      com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest buildPartial() {
      com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest result = new com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest(this);
      result.customerId_ = customerId_;
      if (operationBuilder_ == null) {
        result.operation_ = operation_;
      } else {
        result.operation_ = operationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest) {
        return mergeFrom((com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest other) {
      if (other == com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (other.hasOperation()) {
        mergeOperation(other.getOperation());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * The ID of the customer whose customer link are being modified.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the customer whose customer link are being modified.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the customer whose customer link are being modified.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the customer whose customer link are being modified.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     */
    public Builder clearCustomerId() {
      
      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the customer whose customer link are being modified.
     * </pre>
     *
     * <code>string customer_id = 1;</code>
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerId_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v0.services.CustomerClientLinkOperation operation_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v0.services.CustomerClientLinkOperation, com.google.ads.googleads.v0.services.CustomerClientLinkOperation.Builder, com.google.ads.googleads.v0.services.CustomerClientLinkOperationOrBuilder> operationBuilder_;
    /**
     * <pre>
     * The operation to perform on the individual CustomerClientLink.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
     */
    public boolean hasOperation() {
      return operationBuilder_ != null || operation_ != null;
    }
    /**
     * <pre>
     * The operation to perform on the individual CustomerClientLink.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
     */
    public com.google.ads.googleads.v0.services.CustomerClientLinkOperation getOperation() {
      if (operationBuilder_ == null) {
        return operation_ == null ? com.google.ads.googleads.v0.services.CustomerClientLinkOperation.getDefaultInstance() : operation_;
      } else {
        return operationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The operation to perform on the individual CustomerClientLink.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
     */
    public Builder setOperation(com.google.ads.googleads.v0.services.CustomerClientLinkOperation value) {
      if (operationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operation_ = value;
        onChanged();
      } else {
        operationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operation to perform on the individual CustomerClientLink.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
     */
    public Builder setOperation(
        com.google.ads.googleads.v0.services.CustomerClientLinkOperation.Builder builderForValue) {
      if (operationBuilder_ == null) {
        operation_ = builderForValue.build();
        onChanged();
      } else {
        operationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The operation to perform on the individual CustomerClientLink.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
     */
    public Builder mergeOperation(com.google.ads.googleads.v0.services.CustomerClientLinkOperation value) {
      if (operationBuilder_ == null) {
        if (operation_ != null) {
          operation_ =
            com.google.ads.googleads.v0.services.CustomerClientLinkOperation.newBuilder(operation_).mergeFrom(value).buildPartial();
        } else {
          operation_ = value;
        }
        onChanged();
      } else {
        operationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The operation to perform on the individual CustomerClientLink.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
     */
    public Builder clearOperation() {
      if (operationBuilder_ == null) {
        operation_ = null;
        onChanged();
      } else {
        operation_ = null;
        operationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The operation to perform on the individual CustomerClientLink.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
     */
    public com.google.ads.googleads.v0.services.CustomerClientLinkOperation.Builder getOperationBuilder() {
      
      onChanged();
      return getOperationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The operation to perform on the individual CustomerClientLink.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
     */
    public com.google.ads.googleads.v0.services.CustomerClientLinkOperationOrBuilder getOperationOrBuilder() {
      if (operationBuilder_ != null) {
        return operationBuilder_.getMessageOrBuilder();
      } else {
        return operation_ == null ?
            com.google.ads.googleads.v0.services.CustomerClientLinkOperation.getDefaultInstance() : operation_;
      }
    }
    /**
     * <pre>
     * The operation to perform on the individual CustomerClientLink.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v0.services.CustomerClientLinkOperation, com.google.ads.googleads.v0.services.CustomerClientLinkOperation.Builder, com.google.ads.googleads.v0.services.CustomerClientLinkOperationOrBuilder> 
        getOperationFieldBuilder() {
      if (operationBuilder_ == null) {
        operationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v0.services.CustomerClientLinkOperation, com.google.ads.googleads.v0.services.CustomerClientLinkOperation.Builder, com.google.ads.googleads.v0.services.CustomerClientLinkOperationOrBuilder>(
                getOperation(),
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      return operationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.services.MutateCustomerClientLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.services.MutateCustomerClientLinkRequest)
  private static final com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest();
  }

  public static com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCustomerClientLinkRequest>
      PARSER = new com.google.protobuf.AbstractParser<MutateCustomerClientLinkRequest>() {
    @java.lang.Override
    public MutateCustomerClientLinkRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateCustomerClientLinkRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateCustomerClientLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCustomerClientLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.services.MutateCustomerClientLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

