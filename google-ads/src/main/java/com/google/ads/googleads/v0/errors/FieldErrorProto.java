// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/field_error.proto

package com.google.ads.googleads.v0.errors;

public final class FieldErrorProto {
  private FieldErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_FieldErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_FieldErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v0/errors/field_e" +
      "rror.proto\022\036google.ads.googleads.v0.erro" +
      "rs\"\250\001\n\016FieldErrorEnum\"\225\001\n\nFieldError\022\017\n\013" +
      "UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\014\n\010REQUIRED\020\002" +
      "\022\023\n\017IMMUTABLE_FIELD\020\003\022\021\n\rINVALID_VALUE\020\004" +
      "\022\027\n\023VALUE_MUST_BE_UNSET\020\005\022\032\n\026REQUIRED_NO" +
      "NEMPTY_LIST\020\006B\305\001\n\"com.google.ads.googlea" +
      "ds.v0.errorsB\017FieldErrorProtoP\001ZDgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v0/errors;errors\242\002\003GAA\252\002\036Google.Ads" +
      ".GoogleAds.V0.Errors\312\002\036Google\\Ads\\Google" +
      "Ads\\V0\\Errorsb\006proto3"
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
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_FieldErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_FieldErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_FieldErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}