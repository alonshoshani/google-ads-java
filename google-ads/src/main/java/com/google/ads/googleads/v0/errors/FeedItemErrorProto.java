// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/feed_item_error.proto

package com.google.ads.googleads.v0.errors;

public final class FeedItemErrorProto {
  private FeedItemErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_FeedItemErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_FeedItemErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v0/errors/feed_it" +
      "em_error.proto\022\036google.ads.googleads.v0." +
      "errors\"\207\003\n\021FeedItemErrorEnum\"\361\002\n\rFeedIte" +
      "mError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022.\n*" +
      "CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRI" +
      "NG\020\002\022\'\n#CANNOT_OPERATE_ON_REMOVED_FEED_I" +
      "TEM\020\003\022*\n&DATE_TIME_MUST_BE_IN_ACCOUNT_TI" +
      "ME_ZONE\020\004\022\034\n\030KEY_ATTRIBUTES_NOT_FOUND\020\005\022" +
      "\017\n\013INVALID_URL\020\006\022\032\n\026MISSING_KEY_ATTRIBUT" +
      "ES\020\007\022\035\n\031KEY_ATTRIBUTES_NOT_UNIQUE\020\010\022%\n!C" +
      "ANNOT_MODIFY_KEY_ATTRIBUTE_VALUE\020\t\022,\n(SI" +
      "ZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE\020\n" +
      "B\355\001\n\"com.google.ads.googleads.v0.errorsB" +
      "\022FeedItemErrorProtoP\001ZDgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v0/er" +
      "rors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds" +
      ".V0.Errors\312\002\036Google\\Ads\\GoogleAds\\V0\\Err" +
      "ors\352\002\"Google::Ads::GoogleAds::V0::Errors" +
      "b\006proto3"
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
    internal_static_google_ads_googleads_v0_errors_FeedItemErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_FeedItemErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_FeedItemErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
