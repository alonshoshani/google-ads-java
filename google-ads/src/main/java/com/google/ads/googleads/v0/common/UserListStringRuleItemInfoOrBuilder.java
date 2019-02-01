// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/user_lists.proto

package com.google.ads.googleads.v0.common;

public interface UserListStringRuleItemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.common.UserListStringRuleItemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * String comparison operator.
   * This field is required and must be populated when creating a new string
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator operator = 1;</code>
   */
  int getOperatorValue();
  /**
   * <pre>
   * String comparison operator.
   * This field is required and must be populated when creating a new string
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator operator = 1;</code>
   */
  com.google.ads.googleads.v0.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator getOperator();

  /**
   * <pre>
   * The right hand side of the string rule item. For URLs or referrer URLs,
   * the value can not contain illegal URL chars such as newlines, quotes,
   * tabs, or parentheses. This field is required and must be populated when
   * creating a new string rule item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   */
  boolean hasValue();
  /**
   * <pre>
   * The right hand side of the string rule item. For URLs or referrer URLs,
   * the value can not contain illegal URL chars such as newlines, quotes,
   * tabs, or parentheses. This field is required and must be populated when
   * creating a new string rule item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   */
  com.google.protobuf.StringValue getValue();
  /**
   * <pre>
   * The right hand side of the string rule item. For URLs or referrer URLs,
   * the value can not contain illegal URL chars such as newlines, quotes,
   * tabs, or parentheses. This field is required and must be populated when
   * creating a new string rule item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getValueOrBuilder();
}
