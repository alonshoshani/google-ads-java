// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/carrier_constant_service.proto

package com.google.ads.googleads.v0.services;

public final class CarrierConstantServiceProto {
  private CarrierConstantServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetCarrierConstantRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetCarrierConstantRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v0/services/carri" +
      "er_constant_service.proto\022 google.ads.go" +
      "ogleads.v0.services\0328google/ads/googlead" +
      "s/v0/resources/carrier_constant.proto\032\034g" +
      "oogle/api/annotations.proto\"2\n\031GetCarrie" +
      "rConstantRequest\022\025\n\rresource_name\030\001 \001(\t2" +
      "\320\001\n\026CarrierConstantService\022\265\001\n\022GetCarrie" +
      "rConstant\022;.google.ads.googleads.v0.serv" +
      "ices.GetCarrierConstantRequest\0322.google." +
      "ads.googleads.v0.resources.CarrierConsta" +
      "nt\".\202\323\344\223\002(\022&/v0/{resource_name=carrierCo" +
      "nstants/*}B\202\002\n$com.google.ads.googleads." +
      "v0.servicesB\033CarrierConstantServiceProto" +
      "P\001ZHgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v0/services;services\242\002\003G" +
      "AA\252\002 Google.Ads.GoogleAds.V0.Services\312\002 " +
      "Google\\Ads\\GoogleAds\\V0\\Services\352\002$Googl" +
      "e::Ads::GoogleAds::V0::Servicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.CarrierConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetCarrierConstantRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetCarrierConstantRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetCarrierConstantRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.CarrierConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
