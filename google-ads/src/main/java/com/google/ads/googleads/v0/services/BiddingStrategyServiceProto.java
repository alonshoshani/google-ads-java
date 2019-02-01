// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/bidding_strategy_service.proto

package com.google.ads.googleads.v0.services;

public final class BiddingStrategyServiceProto {
  private BiddingStrategyServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetBiddingStrategyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetBiddingStrategyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateBiddingStrategiesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateBiddingStrategiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_BiddingStrategyOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_BiddingStrategyOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateBiddingStrategiesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateBiddingStrategiesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateBiddingStrategyResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateBiddingStrategyResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v0/services/biddi" +
      "ng_strategy_service.proto\022 google.ads.go" +
      "ogleads.v0.services\0328google/ads/googlead" +
      "s/v0/resources/bidding_strategy.proto\032\034g" +
      "oogle/api/annotations.proto\032 google/prot" +
      "obuf/field_mask.proto\032\036google/protobuf/w" +
      "rappers.proto\032\027google/rpc/status.proto\"2" +
      "\n\031GetBiddingStrategyRequest\022\025\n\rresource_" +
      "name\030\001 \001(\t\"\265\001\n\036MutateBiddingStrategiesRe" +
      "quest\022\023\n\013customer_id\030\001 \001(\t\022N\n\noperations" +
      "\030\002 \003(\0132:.google.ads.googleads.v0.service" +
      "s.BiddingStrategyOperation\022\027\n\017partial_fa" +
      "ilure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\366\001\n\030B" +
      "iddingStrategyOperation\022/\n\013update_mask\030\004" +
      " \001(\0132\032.google.protobuf.FieldMask\022D\n\006crea" +
      "te\030\001 \001(\01322.google.ads.googleads.v0.resou" +
      "rces.BiddingStrategyH\000\022D\n\006update\030\002 \001(\01322" +
      ".google.ads.googleads.v0.resources.Biddi" +
      "ngStrategyH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperat" +
      "ion\"\244\001\n\037MutateBiddingStrategiesResponse\022" +
      "1\n\025partial_failure_error\030\003 \001(\0132\022.google." +
      "rpc.Status\022N\n\007results\030\002 \003(\0132=.google.ads" +
      ".googleads.v0.services.MutateBiddingStra" +
      "tegyResult\"4\n\033MutateBiddingStrategyResul" +
      "t\022\025\n\rresource_name\030\001 \001(\t2\301\003\n\026BiddingStra" +
      "tegyService\022\302\001\n\022GetBiddingStrategy\022;.goo" +
      "gle.ads.googleads.v0.services.GetBidding" +
      "StrategyRequest\0322.google.ads.googleads.v" +
      "0.resources.BiddingStrategy\";\202\323\344\223\0025\0223/v0" +
      "/{resource_name=customers/*/biddingStrat" +
      "egies/*}\022\341\001\n\027MutateBiddingStrategies\022@.g" +
      "oogle.ads.googleads.v0.services.MutateBi" +
      "ddingStrategiesRequest\032A.google.ads.goog" +
      "leads.v0.services.MutateBiddingStrategie" +
      "sResponse\"A\202\323\344\223\002;\"6/v0/customers/{custom" +
      "er_id=*}/biddingStrategies:mutate:\001*B\202\002\n" +
      "$com.google.ads.googleads.v0.servicesB\033B" +
      "iddingStrategyServiceProtoP\001ZHgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v0/services;services\242\002\003GAA\252\002 Google.Ad" +
      "s.GoogleAds.V0.Services\312\002 Google\\Ads\\Goo" +
      "gleAds\\V0\\Services\352\002$Google::Ads::Google" +
      "Ads::V0::Servicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.BiddingStrategyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetBiddingStrategyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetBiddingStrategyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetBiddingStrategyRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateBiddingStrategiesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateBiddingStrategiesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateBiddingStrategiesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v0_services_BiddingStrategyOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_BiddingStrategyOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_BiddingStrategyOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateBiddingStrategiesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateBiddingStrategiesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateBiddingStrategiesResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v0_services_MutateBiddingStrategyResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateBiddingStrategyResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateBiddingStrategyResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.BiddingStrategyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
