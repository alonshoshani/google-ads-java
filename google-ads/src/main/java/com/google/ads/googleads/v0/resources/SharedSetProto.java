// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/shared_set.proto

package com.google.ads.googleads.v0.resources;

public final class SharedSetProto {
  private SharedSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_SharedSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_SharedSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v0/resources/shar" +
      "ed_set.proto\022!google.ads.googleads.v0.re" +
      "sources\0325google/ads/googleads/v0/enums/s" +
      "hared_set_status.proto\0323google/ads/googl" +
      "eads/v0/enums/shared_set_type.proto\032\036goo" +
      "gle/protobuf/wrappers.proto\"\202\003\n\tSharedSe" +
      "t\022\025\n\rresource_name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.g" +
      "oogle.protobuf.Int64Value\022L\n\004type\030\003 \001(\0162" +
      ">.google.ads.googleads.v0.enums.SharedSe" +
      "tTypeEnum.SharedSetType\022*\n\004name\030\004 \001(\0132\034." +
      "google.protobuf.StringValue\022R\n\006status\030\005 " +
      "\001(\0162B.google.ads.googleads.v0.enums.Shar" +
      "edSetStatusEnum.SharedSetStatus\0221\n\014membe" +
      "r_count\030\006 \001(\0132\033.google.protobuf.Int64Val" +
      "ue\0224\n\017reference_count\030\007 \001(\0132\033.google.pro" +
      "tobuf.Int64ValueB\373\001\n%com.google.ads.goog" +
      "leads.v0.resourcesB\016SharedSetProtoP\001ZJgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v0/resources;resources\242\002\003GAA\252\002" +
      "!Google.Ads.GoogleAds.V0.Resources\312\002!Goo" +
      "gle\\Ads\\GoogleAds\\V0\\Resources\352\002%Google:" +
      ":Ads::GoogleAds::V0::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.enums.SharedSetStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.SharedSetTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_SharedSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_SharedSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_SharedSet_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Type", "Name", "Status", "MemberCount", "ReferenceCount", });
    com.google.ads.googleads.v0.enums.SharedSetStatusProto.getDescriptor();
    com.google.ads.googleads.v0.enums.SharedSetTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
