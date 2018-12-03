// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/keyword_plan_negative_keyword_service.proto

package com.google.ads.googleads.v0.services;

public final class KeywordPlanNegativeKeywordServiceProto {
  private KeywordPlanNegativeKeywordServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetKeywordPlanNegativeKeywordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetKeywordPlanNegativeKeywordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_KeywordPlanNegativeKeywordOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_KeywordPlanNegativeKeywordOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/ads/googleads/v0/services/keywo" +
      "rd_plan_negative_keyword_service.proto\022 " +
      "google.ads.googleads.v0.services\032Egoogle" +
      "/ads/googleads/v0/resources/keyword_plan" +
      "_negative_keyword.proto\032\034google/api/anno" +
      "tations.proto\032 google/protobuf/field_mas" +
      "k.proto\"=\n$GetKeywordPlanNegativeKeyword" +
      "Request\022\025\n\rresource_name\030\001 \001(\t\"\232\001\n(Mutat" +
      "eKeywordPlanNegativeKeywordsRequest\022\023\n\013c" +
      "ustomer_id\030\001 \001(\t\022Y\n\noperations\030\002 \003(\0132E.g" +
      "oogle.ads.googleads.v0.services.KeywordP" +
      "lanNegativeKeywordOperation\"\227\002\n#KeywordP" +
      "lanNegativeKeywordOperation\022/\n\013update_ma" +
      "sk\030\004 \001(\0132\032.google.protobuf.FieldMask\022O\n\006" +
      "create\030\001 \001(\0132=.google.ads.googleads.v0.r" +
      "esources.KeywordPlanNegativeKeywordH\000\022O\n" +
      "\006update\030\002 \001(\0132=.google.ads.googleads.v0." +
      "resources.KeywordPlanNegativeKeywordH\000\022\020" +
      "\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\206\001\n)Mutate" +
      "KeywordPlanNegativeKeywordsResponse\022Y\n\007r" +
      "esults\030\002 \003(\0132H.google.ads.googleads.v0.s" +
      "ervices.MutateKeywordPlanNegativeKeyword" +
      "Result\"?\n&MutateKeywordPlanNegativeKeywo" +
      "rdResult\022\025\n\rresource_name\030\001 \001(\t2\237\004\n!Keyw" +
      "ordPlanNegativeKeywordService\022\355\001\n\035GetKey" +
      "wordPlanNegativeKeyword\022F.google.ads.goo" +
      "gleads.v0.services.GetKeywordPlanNegativ" +
      "eKeywordRequest\032=.google.ads.googleads.v" +
      "0.resources.KeywordPlanNegativeKeyword\"E" +
      "\202\323\344\223\002?\022=/v0/{resource_name=customers/*/k" +
      "eywordPlanNegativeKeywords/*}\022\211\002\n!Mutate" +
      "KeywordPlanNegativeKeywords\022J.google.ads" +
      ".googleads.v0.services.MutateKeywordPlan" +
      "NegativeKeywordsRequest\032K.google.ads.goo" +
      "gleads.v0.services.MutateKeywordPlanNega" +
      "tiveKeywordsResponse\"K\202\323\344\223\002E\"@/v0/custom" +
      "ers/{customer_id=*}/keywordPlanNegativeK" +
      "eywords:mutate:\001*B\346\001\n$com.google.ads.goo" +
      "gleads.v0.servicesB&KeywordPlanNegativeK" +
      "eywordServiceProtoP\001ZHgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v0/ser" +
      "vices;services\242\002\003GAA\252\002 Google.Ads.Google" +
      "Ads.V0.Services\312\002 Google\\Ads\\GoogleAds\\V" +
      "0\\Servicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.KeywordPlanNegativeKeywordProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetKeywordPlanNegativeKeywordRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetKeywordPlanNegativeKeywordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetKeywordPlanNegativeKeywordRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v0_services_KeywordPlanNegativeKeywordOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_KeywordPlanNegativeKeywordOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_KeywordPlanNegativeKeywordOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateKeywordPlanNegativeKeywordResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.KeywordPlanNegativeKeywordProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}