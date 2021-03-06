// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/user_list_service.proto

package com.google.ads.googleads.v2.services;

public final class UserListServiceProto {
  private UserListServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetUserListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetUserListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateUserListsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateUserListsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_UserListOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_UserListOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateUserListsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateUserListsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateUserListResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateUserListResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v2/services/user_" +
      "list_service.proto\022 google.ads.googleads" +
      ".v2.services\0321google/ads/googleads/v2/re" +
      "sources/user_list.proto\032\034google/api/anno" +
      "tations.proto\032 google/protobuf/field_mas" +
      "k.proto\032\027google/rpc/status.proto\032\027google" +
      "/api/client.proto\"+\n\022GetUserListRequest\022" +
      "\025\n\rresource_name\030\001 \001(\t\"\246\001\n\026MutateUserLis" +
      "tsRequest\022\023\n\013customer_id\030\001 \001(\t\022G\n\noperat" +
      "ions\030\002 \003(\01323.google.ads.googleads.v2.ser" +
      "vices.UserListOperation\022\027\n\017partial_failu" +
      "re\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\341\001\n\021User" +
      "ListOperation\022/\n\013update_mask\030\004 \001(\0132\032.goo" +
      "gle.protobuf.FieldMask\022=\n\006create\030\001 \001(\0132+" +
      ".google.ads.googleads.v2.resources.UserL" +
      "istH\000\022=\n\006update\030\002 \001(\0132+.google.ads.googl" +
      "eads.v2.resources.UserListH\000\022\020\n\006remove\030\003" +
      " \001(\tH\000B\013\n\toperation\"\225\001\n\027MutateUserListsR" +
      "esponse\0221\n\025partial_failure_error\030\003 \001(\0132\022" +
      ".google.rpc.Status\022G\n\007results\030\002 \003(\01326.go" +
      "ogle.ads.googleads.v2.services.MutateUse" +
      "rListResult\"-\n\024MutateUserListResult\022\025\n\rr" +
      "esource_name\030\001 \001(\t2\232\003\n\017UserListService\022\245" +
      "\001\n\013GetUserList\0224.google.ads.googleads.v2" +
      ".services.GetUserListRequest\032+.google.ad" +
      "s.googleads.v2.resources.UserList\"3\202\323\344\223\002" +
      "-\022+/v2/{resource_name=customers/*/userLi" +
      "sts/*}\022\301\001\n\017MutateUserLists\0228.google.ads." +
      "googleads.v2.services.MutateUserListsReq" +
      "uest\0329.google.ads.googleads.v2.services." +
      "MutateUserListsResponse\"9\202\323\344\223\0023\"./v2/cus" +
      "tomers/{customer_id=*}/userLists:mutate:" +
      "\001*\032\033\312A\030googleads.googleapis.comB\373\001\n$com." +
      "google.ads.googleads.v2.servicesB\024UserLi" +
      "stServiceProtoP\001ZHgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v2/service" +
      "s;services\242\002\003GAA\252\002 Google.Ads.GoogleAds." +
      "V2.Services\312\002 Google\\Ads\\GoogleAds\\V2\\Se" +
      "rvices\352\002$Google::Ads::GoogleAds::V2::Ser" +
      "vicesb\006proto3"
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
          com.google.ads.googleads.v2.resources.UserListProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetUserListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetUserListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetUserListRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateUserListsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateUserListsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateUserListsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_UserListOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_UserListOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_UserListOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateUserListsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateUserListsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateUserListsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_MutateUserListResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateUserListResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateUserListResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.UserListProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
