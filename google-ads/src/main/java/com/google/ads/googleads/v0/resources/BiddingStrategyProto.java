// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/bidding_strategy.proto

package com.google.ads.googleads.v0.resources;

public final class BiddingStrategyProto {
  private BiddingStrategyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_BiddingStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_BiddingStrategy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v0/resources/bidd" +
      "ing_strategy.proto\022!google.ads.googleads" +
      ".v0.resources\032,google/ads/googleads/v0/c" +
      "ommon/bidding.proto\0329google/ads/googlead" +
      "s/v0/enums/bidding_strategy_type.proto\032\036" +
      "google/protobuf/wrappers.proto\"\221\005\n\017Biddi" +
      "ngStrategy\022\025\n\rresource_name\030\001 \001(\t\022\'\n\002id\030" +
      "\003 \001(\0132\033.google.protobuf.Int64Value\022*\n\004na" +
      "me\030\004 \001(\0132\034.google.protobuf.StringValue\022X" +
      "\n\004type\030\005 \001(\0162J.google.ads.googleads.v0.e" +
      "nums.BiddingStrategyTypeEnum.BiddingStra" +
      "tegyType\022C\n\014enhanced_cpc\030\007 \001(\0132+.google." +
      "ads.googleads.v0.common.EnhancedCpcH\000\022L\n" +
      "\021page_one_promoted\030\010 \001(\0132/.google.ads.go" +
      "ogleads.v0.common.PageOnePromotedH\000\022?\n\nt" +
      "arget_cpa\030\t \001(\0132).google.ads.googleads.v" +
      "0.common.TargetCpaH\000\022R\n\024target_outrank_s" +
      "hare\030\n \001(\01322.google.ads.googleads.v0.com" +
      "mon.TargetOutrankShareH\000\022A\n\013target_roas\030" +
      "\013 \001(\0132*.google.ads.googleads.v0.common.T" +
      "argetRoasH\000\022C\n\014target_spend\030\014 \001(\0132+.goog" +
      "le.ads.googleads.v0.common.TargetSpendH\000" +
      "B\010\n\006schemeB\201\002\n%com.google.ads.googleads." +
      "v0.resourcesB\024BiddingStrategyProtoP\001ZJgo" +
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
          com.google.ads.googleads.v0.common.BiddingProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_BiddingStrategy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_BiddingStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_BiddingStrategy_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Type", "EnhancedCpc", "PageOnePromoted", "TargetCpa", "TargetOutrankShare", "TargetRoas", "TargetSpend", "Scheme", });
    com.google.ads.googleads.v0.common.BiddingProto.getDescriptor();
    com.google.ads.googleads.v0.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
