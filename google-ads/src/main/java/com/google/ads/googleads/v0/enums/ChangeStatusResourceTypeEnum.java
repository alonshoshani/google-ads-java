// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/enums/change_status_resource_type.proto

package com.google.ads.googleads.v0.enums;

/**
 * <pre>
 * Container for enum describing supported resource types for the ChangeStatus
 * resource.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum}
 */
public  final class ChangeStatusResourceTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum)
    ChangeStatusResourceTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeStatusResourceTypeEnum.newBuilder() to construct.
  private ChangeStatusResourceTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeStatusResourceTypeEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangeStatusResourceTypeEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
    return com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeProto.internal_static_google_ads_googleads_v0_enums_ChangeStatusResourceTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeProto.internal_static_google_ads_googleads_v0_enums_ChangeStatusResourceTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum.class, com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum listing the resource types support by the ChangeStatus resource.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum.ChangeStatusResourceType}
   */
  public enum ChangeStatusResourceType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents an unclassified resource unknown
     * in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * An AdGroup resource change.
     * </pre>
     *
     * <code>AD_GROUP = 3;</code>
     */
    AD_GROUP(3),
    /**
     * <pre>
     * An AdGroupAd resource change.
     * </pre>
     *
     * <code>AD_GROUP_AD = 4;</code>
     */
    AD_GROUP_AD(4),
    /**
     * <pre>
     * An AdGroupCriterion resource change.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION = 5;</code>
     */
    AD_GROUP_CRITERION(5),
    /**
     * <pre>
     * A Campaign resource change.
     * </pre>
     *
     * <code>CAMPAIGN = 6;</code>
     */
    CAMPAIGN(6),
    /**
     * <pre>
     * A CampaignCriterion resource change.
     * </pre>
     *
     * <code>CAMPAIGN_CRITERION = 7;</code>
     */
    CAMPAIGN_CRITERION(7),
    /**
     * <pre>
     * A Feed resource change.
     * </pre>
     *
     * <code>FEED = 9;</code>
     */
    FEED(9),
    /**
     * <pre>
     * A FeedItem resource change.
     * </pre>
     *
     * <code>FEED_ITEM = 10;</code>
     */
    FEED_ITEM(10),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents an unclassified resource unknown
     * in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * An AdGroup resource change.
     * </pre>
     *
     * <code>AD_GROUP = 3;</code>
     */
    public static final int AD_GROUP_VALUE = 3;
    /**
     * <pre>
     * An AdGroupAd resource change.
     * </pre>
     *
     * <code>AD_GROUP_AD = 4;</code>
     */
    public static final int AD_GROUP_AD_VALUE = 4;
    /**
     * <pre>
     * An AdGroupCriterion resource change.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION = 5;</code>
     */
    public static final int AD_GROUP_CRITERION_VALUE = 5;
    /**
     * <pre>
     * A Campaign resource change.
     * </pre>
     *
     * <code>CAMPAIGN = 6;</code>
     */
    public static final int CAMPAIGN_VALUE = 6;
    /**
     * <pre>
     * A CampaignCriterion resource change.
     * </pre>
     *
     * <code>CAMPAIGN_CRITERION = 7;</code>
     */
    public static final int CAMPAIGN_CRITERION_VALUE = 7;
    /**
     * <pre>
     * A Feed resource change.
     * </pre>
     *
     * <code>FEED = 9;</code>
     */
    public static final int FEED_VALUE = 9;
    /**
     * <pre>
     * A FeedItem resource change.
     * </pre>
     *
     * <code>FEED_ITEM = 10;</code>
     */
    public static final int FEED_ITEM_VALUE = 10;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ChangeStatusResourceType valueOf(int value) {
      return forNumber(value);
    }

    public static ChangeStatusResourceType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 3: return AD_GROUP;
        case 4: return AD_GROUP_AD;
        case 5: return AD_GROUP_CRITERION;
        case 6: return CAMPAIGN;
        case 7: return CAMPAIGN_CRITERION;
        case 9: return FEED;
        case 10: return FEED_ITEM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChangeStatusResourceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChangeStatusResourceType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChangeStatusResourceType>() {
            public ChangeStatusResourceType findValueByNumber(int number) {
              return ChangeStatusResourceType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChangeStatusResourceType[] VALUES = values();

    public static ChangeStatusResourceType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ChangeStatusResourceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum.ChangeStatusResourceType)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum other = (com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum) obj;

    boolean result = true;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum prototype) {
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
   * Container for enum describing supported resource types for the ChangeStatus
   * resource.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum)
      com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeProto.internal_static_google_ads_googleads_v0_enums_ChangeStatusResourceTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeProto.internal_static_google_ads_googleads_v0_enums_ChangeStatusResourceTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum.class, com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeProto.internal_static_google_ads_googleads_v0_enums_ChangeStatusResourceTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum build() {
      com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum buildPartial() {
      com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum result = new com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum other) {
      if (other == com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum)
  private static final com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum();
  }

  public static com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeStatusResourceTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<ChangeStatusResourceTypeEnum>() {
    @java.lang.Override
    public ChangeStatusResourceTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangeStatusResourceTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangeStatusResourceTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeStatusResourceTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.enums.ChangeStatusResourceTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

