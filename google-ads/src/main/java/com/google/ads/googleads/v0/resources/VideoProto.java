// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/video.proto

package com.google.ads.googleads.v0.resources;

public final class VideoProto {
  private VideoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_Video_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_Video_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v0/resources/vide" +
      "o.proto\022!google.ads.googleads.v0.resourc" +
      "es\032\036google/protobuf/wrappers.proto\"\335\001\n\005V" +
      "ideo\022\025\n\rresource_name\030\001 \001(\t\022(\n\002id\030\002 \001(\0132" +
      "\034.google.protobuf.StringValue\0220\n\nchannel" +
      "_id\030\003 \001(\0132\034.google.protobuf.StringValue\022" +
      "4\n\017duration_millis\030\004 \001(\0132\033.google.protob" +
      "uf.Int64Value\022+\n\005title\030\005 \001(\0132\034.google.pr" +
      "otobuf.StringValueB\367\001\n%com.google.ads.go" +
      "ogleads.v0.resourcesB\nVideoProtoP\001ZJgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v0/resources;resources\242\002\003GAA\252\002!G" +
      "oogle.Ads.GoogleAds.V0.Resources\312\002!Googl" +
      "e\\Ads\\GoogleAds\\V0\\Resources\352\002%Google::A" +
      "ds::GoogleAds::V0::Resourcesb\006proto3"
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
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_Video_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_Video_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_Video_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ChannelId", "DurationMillis", "Title", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
