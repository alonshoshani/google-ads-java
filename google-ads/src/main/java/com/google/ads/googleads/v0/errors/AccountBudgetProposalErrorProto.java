// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/account_budget_proposal_error.proto

package com.google.ads.googleads.v0.errors;

public final class AccountBudgetProposalErrorProto {
  private AccountBudgetProposalErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_AccountBudgetProposalErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_AccountBudgetProposalErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v0/errors/account" +
      "_budget_proposal_error.proto\022\036google.ads" +
      ".googleads.v0.errors\"\324\006\n\036AccountBudgetPr" +
      "oposalErrorEnum\"\261\006\n\032AccountBudgetProposa" +
      "lError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\032\n\026" +
      "FIELD_MASK_NOT_ALLOWED\020\002\022\023\n\017IMMUTABLE_FI" +
      "ELD\020\003\022\032\n\026REQUIRED_FIELD_MISSING\020\004\022#\n\037CAN" +
      "NOT_CANCEL_APPROVED_PROPOSAL\020\005\022#\n\037CANNOT" +
      "_REMOVE_UNAPPROVED_BUDGET\020\006\022 \n\034CANNOT_RE" +
      "MOVE_RUNNING_BUDGET\020\007\022 \n\034CANNOT_END_UNAP" +
      "PROVED_BUDGET\020\010\022\036\n\032CANNOT_END_INACTIVE_B" +
      "UDGET\020\t\022\030\n\024BUDGET_NAME_REQUIRED\020\n\022\034\n\030CAN" +
      "NOT_UPDATE_OLD_BUDGET\020\013\022\026\n\022CANNOT_END_IN" +
      "_PAST\020\014\022\032\n\026CANNOT_EXTEND_END_TIME\020\r\022\"\n\036P" +
      "URCHASE_ORDER_NUMBER_REQUIRED\020\016\022\"\n\036PENDI" +
      "NG_UPDATE_PROPOSAL_EXISTS\020\017\022=\n9MULTIPLE_" +
      "BUDGETS_NOT_ALLOWED_FOR_UNAPPROVED_BILLI" +
      "NG_SETUP\020\020\022/\n+CANNOT_UPDATE_START_TIME_F" +
      "OR_STARTED_BUDGET\020\021\0226\n2SPENDING_LIMIT_LO" +
      "WER_THAN_ACCRUED_COST_NOT_ALLOWED\020\022\022\023\n\017U" +
      "PDATE_IS_NO_OP\020\023\022#\n\037END_TIME_MUST_FOLLOW" +
      "_START_TIME\020\024\0225\n1BUDGET_DATE_RANGE_INCOM" +
      "PATIBLE_WITH_BILLING_SETUP\020\025\022\022\n\016NOT_AUTH" +
      "ORIZED\020\026\022\031\n\025INVALID_BILLING_SETUP\020\027B\372\001\n\"" +
      "com.google.ads.googleads.v0.errorsB\037Acco" +
      "untBudgetProposalErrorProtoP\001ZDgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v0/errors;errors\242\002\003GAA\252\002\036Google.Ads.G" +
      "oogleAds.V0.Errors\312\002\036Google\\Ads\\GoogleAd" +
      "s\\V0\\Errors\352\002\"Google::Ads::GoogleAds::V0" +
      "::Errorsb\006proto3"
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
    internal_static_google_ads_googleads_v0_errors_AccountBudgetProposalErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_AccountBudgetProposalErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_AccountBudgetProposalErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
