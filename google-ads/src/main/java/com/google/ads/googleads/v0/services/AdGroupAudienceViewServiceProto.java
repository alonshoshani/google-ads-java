// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/ad_group_audience_view_service.proto

package com.google.ads.googleads.v0.services;

public final class AdGroupAudienceViewServiceProto {
  private AdGroupAudienceViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetAdGroupAudienceViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetAdGroupAudienceViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v0/services/ad_gr" +
      "oup_audience_view_service.proto\022 google." +
      "ads.googleads.v0.services\032>google/ads/go" +
      "ogleads/v0/resources/ad_group_audience_v" +
      "iew.proto\032\034google/api/annotations.proto\"" +
      "6\n\035GetAdGroupAudienceViewRequest\022\025\n\rreso" +
      "urce_name\030\001 \001(\t2\360\001\n\032AdGroupAudienceViewS" +
      "ervice\022\321\001\n\026GetAdGroupAudienceView\022?.goog" +
      "le.ads.googleads.v0.services.GetAdGroupA" +
      "udienceViewRequest\0326.google.ads.googlead" +
      "s.v0.resources.AdGroupAudienceView\">\202\323\344\223" +
      "\0028\0226/v0/{resource_name=customers/*/adGro" +
      "upAudienceViews/*}B\206\002\n$com.google.ads.go" +
      "ogleads.v0.servicesB\037AdGroupAudienceView" +
      "ServiceProtoP\001ZHgoogle.golang.org/genpro" +
      "to/googleapis/ads/googleads/v0/services;" +
      "services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V0" +
      ".Services\312\002 Google\\Ads\\GoogleAds\\V0\\Serv" +
      "ices\352\002$Google::Ads::GoogleAds::V0::Servi" +
      "cesb\006proto3"
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
          com.google.ads.googleads.v0.resources.AdGroupAudienceViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetAdGroupAudienceViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetAdGroupAudienceViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetAdGroupAudienceViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.AdGroupAudienceViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
