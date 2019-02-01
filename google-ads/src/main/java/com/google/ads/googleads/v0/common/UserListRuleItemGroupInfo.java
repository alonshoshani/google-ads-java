// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/user_lists.proto

package com.google.ads.googleads.v0.common;

/**
 * <pre>
 * A group of rule items.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.common.UserListRuleItemGroupInfo}
 */
public  final class UserListRuleItemGroupInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.common.UserListRuleItemGroupInfo)
    UserListRuleItemGroupInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListRuleItemGroupInfo.newBuilder() to construct.
  private UserListRuleItemGroupInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListRuleItemGroupInfo() {
    ruleItems_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserListRuleItemGroupInfo(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              ruleItems_ = new java.util.ArrayList<com.google.ads.googleads.v0.common.UserListRuleItemInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            ruleItems_.add(
                input.readMessage(com.google.ads.googleads.v0.common.UserListRuleItemInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        ruleItems_ = java.util.Collections.unmodifiableList(ruleItems_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v0.common.UserListsProto.internal_static_google_ads_googleads_v0_common_UserListRuleItemGroupInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.common.UserListsProto.internal_static_google_ads_googleads_v0_common_UserListRuleItemGroupInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo.class, com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo.Builder.class);
  }

  public static final int RULE_ITEMS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v0.common.UserListRuleItemInfo> ruleItems_;
  /**
   * <pre>
   * Rule items that will be grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
   */
  public java.util.List<com.google.ads.googleads.v0.common.UserListRuleItemInfo> getRuleItemsList() {
    return ruleItems_;
  }
  /**
   * <pre>
   * Rule items that will be grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.v0.common.UserListRuleItemInfoOrBuilder> 
      getRuleItemsOrBuilderList() {
    return ruleItems_;
  }
  /**
   * <pre>
   * Rule items that will be grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
   */
  public int getRuleItemsCount() {
    return ruleItems_.size();
  }
  /**
   * <pre>
   * Rule items that will be grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
   */
  public com.google.ads.googleads.v0.common.UserListRuleItemInfo getRuleItems(int index) {
    return ruleItems_.get(index);
  }
  /**
   * <pre>
   * Rule items that will be grouped together based on rule_type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
   */
  public com.google.ads.googleads.v0.common.UserListRuleItemInfoOrBuilder getRuleItemsOrBuilder(
      int index) {
    return ruleItems_.get(index);
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
    for (int i = 0; i < ruleItems_.size(); i++) {
      output.writeMessage(1, ruleItems_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ruleItems_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ruleItems_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo other = (com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo) obj;

    boolean result = true;
    result = result && getRuleItemsList()
        .equals(other.getRuleItemsList());
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
    if (getRuleItemsCount() > 0) {
      hash = (37 * hash) + RULE_ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getRuleItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo prototype) {
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
   * A group of rule items.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.common.UserListRuleItemGroupInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.common.UserListRuleItemGroupInfo)
      com.google.ads.googleads.v0.common.UserListRuleItemGroupInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.common.UserListsProto.internal_static_google_ads_googleads_v0_common_UserListRuleItemGroupInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.common.UserListsProto.internal_static_google_ads_googleads_v0_common_UserListRuleItemGroupInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo.class, com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo.newBuilder()
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
        getRuleItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ruleItemsBuilder_ == null) {
        ruleItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ruleItemsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.common.UserListsProto.internal_static_google_ads_googleads_v0_common_UserListRuleItemGroupInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo build() {
      com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo buildPartial() {
      com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo result = new com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo(this);
      int from_bitField0_ = bitField0_;
      if (ruleItemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          ruleItems_ = java.util.Collections.unmodifiableList(ruleItems_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ruleItems_ = ruleItems_;
      } else {
        result.ruleItems_ = ruleItemsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo) {
        return mergeFrom((com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo other) {
      if (other == com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo.getDefaultInstance()) return this;
      if (ruleItemsBuilder_ == null) {
        if (!other.ruleItems_.isEmpty()) {
          if (ruleItems_.isEmpty()) {
            ruleItems_ = other.ruleItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRuleItemsIsMutable();
            ruleItems_.addAll(other.ruleItems_);
          }
          onChanged();
        }
      } else {
        if (!other.ruleItems_.isEmpty()) {
          if (ruleItemsBuilder_.isEmpty()) {
            ruleItemsBuilder_.dispose();
            ruleItemsBuilder_ = null;
            ruleItems_ = other.ruleItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ruleItemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRuleItemsFieldBuilder() : null;
          } else {
            ruleItemsBuilder_.addAllMessages(other.ruleItems_);
          }
        }
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
      com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v0.common.UserListRuleItemInfo> ruleItems_ =
      java.util.Collections.emptyList();
    private void ensureRuleItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ruleItems_ = new java.util.ArrayList<com.google.ads.googleads.v0.common.UserListRuleItemInfo>(ruleItems_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v0.common.UserListRuleItemInfo, com.google.ads.googleads.v0.common.UserListRuleItemInfo.Builder, com.google.ads.googleads.v0.common.UserListRuleItemInfoOrBuilder> ruleItemsBuilder_;

    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v0.common.UserListRuleItemInfo> getRuleItemsList() {
      if (ruleItemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ruleItems_);
      } else {
        return ruleItemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public int getRuleItemsCount() {
      if (ruleItemsBuilder_ == null) {
        return ruleItems_.size();
      } else {
        return ruleItemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public com.google.ads.googleads.v0.common.UserListRuleItemInfo getRuleItems(int index) {
      if (ruleItemsBuilder_ == null) {
        return ruleItems_.get(index);
      } else {
        return ruleItemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public Builder setRuleItems(
        int index, com.google.ads.googleads.v0.common.UserListRuleItemInfo value) {
      if (ruleItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleItemsIsMutable();
        ruleItems_.set(index, value);
        onChanged();
      } else {
        ruleItemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public Builder setRuleItems(
        int index, com.google.ads.googleads.v0.common.UserListRuleItemInfo.Builder builderForValue) {
      if (ruleItemsBuilder_ == null) {
        ensureRuleItemsIsMutable();
        ruleItems_.set(index, builderForValue.build());
        onChanged();
      } else {
        ruleItemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public Builder addRuleItems(com.google.ads.googleads.v0.common.UserListRuleItemInfo value) {
      if (ruleItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleItemsIsMutable();
        ruleItems_.add(value);
        onChanged();
      } else {
        ruleItemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public Builder addRuleItems(
        int index, com.google.ads.googleads.v0.common.UserListRuleItemInfo value) {
      if (ruleItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleItemsIsMutable();
        ruleItems_.add(index, value);
        onChanged();
      } else {
        ruleItemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public Builder addRuleItems(
        com.google.ads.googleads.v0.common.UserListRuleItemInfo.Builder builderForValue) {
      if (ruleItemsBuilder_ == null) {
        ensureRuleItemsIsMutable();
        ruleItems_.add(builderForValue.build());
        onChanged();
      } else {
        ruleItemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public Builder addRuleItems(
        int index, com.google.ads.googleads.v0.common.UserListRuleItemInfo.Builder builderForValue) {
      if (ruleItemsBuilder_ == null) {
        ensureRuleItemsIsMutable();
        ruleItems_.add(index, builderForValue.build());
        onChanged();
      } else {
        ruleItemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public Builder addAllRuleItems(
        java.lang.Iterable<? extends com.google.ads.googleads.v0.common.UserListRuleItemInfo> values) {
      if (ruleItemsBuilder_ == null) {
        ensureRuleItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ruleItems_);
        onChanged();
      } else {
        ruleItemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public Builder clearRuleItems() {
      if (ruleItemsBuilder_ == null) {
        ruleItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ruleItemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public Builder removeRuleItems(int index) {
      if (ruleItemsBuilder_ == null) {
        ensureRuleItemsIsMutable();
        ruleItems_.remove(index);
        onChanged();
      } else {
        ruleItemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public com.google.ads.googleads.v0.common.UserListRuleItemInfo.Builder getRuleItemsBuilder(
        int index) {
      return getRuleItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public com.google.ads.googleads.v0.common.UserListRuleItemInfoOrBuilder getRuleItemsOrBuilder(
        int index) {
      if (ruleItemsBuilder_ == null) {
        return ruleItems_.get(index);  } else {
        return ruleItemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v0.common.UserListRuleItemInfoOrBuilder> 
         getRuleItemsOrBuilderList() {
      if (ruleItemsBuilder_ != null) {
        return ruleItemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ruleItems_);
      }
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public com.google.ads.googleads.v0.common.UserListRuleItemInfo.Builder addRuleItemsBuilder() {
      return getRuleItemsFieldBuilder().addBuilder(
          com.google.ads.googleads.v0.common.UserListRuleItemInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public com.google.ads.googleads.v0.common.UserListRuleItemInfo.Builder addRuleItemsBuilder(
        int index) {
      return getRuleItemsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v0.common.UserListRuleItemInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * Rule items that will be grouped together based on rule_type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v0.common.UserListRuleItemInfo rule_items = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v0.common.UserListRuleItemInfo.Builder> 
         getRuleItemsBuilderList() {
      return getRuleItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v0.common.UserListRuleItemInfo, com.google.ads.googleads.v0.common.UserListRuleItemInfo.Builder, com.google.ads.googleads.v0.common.UserListRuleItemInfoOrBuilder> 
        getRuleItemsFieldBuilder() {
      if (ruleItemsBuilder_ == null) {
        ruleItemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v0.common.UserListRuleItemInfo, com.google.ads.googleads.v0.common.UserListRuleItemInfo.Builder, com.google.ads.googleads.v0.common.UserListRuleItemInfoOrBuilder>(
                ruleItems_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        ruleItems_ = null;
      }
      return ruleItemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.common.UserListRuleItemGroupInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.common.UserListRuleItemGroupInfo)
  private static final com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo();
  }

  public static com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListRuleItemGroupInfo>
      PARSER = new com.google.protobuf.AbstractParser<UserListRuleItemGroupInfo>() {
    @java.lang.Override
    public UserListRuleItemGroupInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserListRuleItemGroupInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserListRuleItemGroupInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListRuleItemGroupInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.common.UserListRuleItemGroupInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

