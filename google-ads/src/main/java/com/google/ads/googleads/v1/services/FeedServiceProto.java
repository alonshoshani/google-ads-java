// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/feed_service.proto

package com.google.ads.googleads.v1.services;

public final class FeedServiceProto {
  private FeedServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetFeedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateFeedsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateFeedsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_FeedOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_FeedOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateFeedsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateFeedsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateFeedResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateFeedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v1/services/feed_" +
      "service.proto\022 google.ads.googleads.v1.s" +
      "ervices\032,google/ads/googleads/v1/resourc" +
      "es/feed.proto\032\034google/api/annotations.pr" +
      "oto\032 google/protobuf/field_mask.proto\032\036g" +
      "oogle/protobuf/wrappers.proto\032\027google/rp" +
      "c/status.proto\032\027google/api/client.proto\"" +
      "\'\n\016GetFeedRequest\022\025\n\rresource_name\030\001 \001(\t" +
      "\"\236\001\n\022MutateFeedsRequest\022\023\n\013customer_id\030\001" +
      " \001(\t\022C\n\noperations\030\002 \003(\0132/.google.ads.go" +
      "ogleads.v1.services.FeedOperation\022\027\n\017par" +
      "tial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(" +
      "\010\"\325\001\n\rFeedOperation\022/\n\013update_mask\030\004 \001(\013" +
      "2\032.google.protobuf.FieldMask\0229\n\006create\030\001" +
      " \001(\0132\'.google.ads.googleads.v1.resources" +
      ".FeedH\000\0229\n\006update\030\002 \001(\0132\'.google.ads.goo" +
      "gleads.v1.resources.FeedH\000\022\020\n\006remove\030\003 \001" +
      "(\tH\000B\013\n\toperation\"\215\001\n\023MutateFeedsRespons" +
      "e\0221\n\025partial_failure_error\030\003 \001(\0132\022.googl" +
      "e.rpc.Status\022C\n\007results\030\002 \003(\01322.google.a" +
      "ds.googleads.v1.services.MutateFeedResul" +
      "t\")\n\020MutateFeedResult\022\025\n\rresource_name\030\001" +
      " \001(\t2\366\002\n\013FeedService\022\225\001\n\007GetFeed\0220.googl" +
      "e.ads.googleads.v1.services.GetFeedReque" +
      "st\032\'.google.ads.googleads.v1.resources.F" +
      "eed\"/\202\323\344\223\002)\022\'/v1/{resource_name=customer" +
      "s/*/feeds/*}\022\261\001\n\013MutateFeeds\0224.google.ad" +
      "s.googleads.v1.services.MutateFeedsReque" +
      "st\0325.google.ads.googleads.v1.services.Mu" +
      "tateFeedsResponse\"5\202\323\344\223\002/\"*/v1/customers" +
      "/{customer_id=*}/feeds:mutate:\001*\032\033\312A\030goo" +
      "gleads.googleapis.comB\367\001\n$com.google.ads" +
      ".googleads.v1.servicesB\020FeedServiceProto" +
      "P\001ZHgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v1/services;services\242\002\003G" +
      "AA\252\002 Google.Ads.GoogleAds.V1.Services\312\002 " +
      "Google\\Ads\\GoogleAds\\V1\\Services\352\002$Googl" +
      "e::Ads::GoogleAds::V1::Servicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.FeedProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetFeedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetFeedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetFeedRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateFeedsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateFeedsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateFeedsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_FeedOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_FeedOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_FeedOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateFeedsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateFeedsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateFeedsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateFeedResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateFeedResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateFeedResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.FeedProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
