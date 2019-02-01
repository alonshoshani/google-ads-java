// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/user_lists.proto

package com.google.ads.googleads.v0.common;

public interface ExpressionRuleUserListInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.common.ExpressionRuleUserListInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Boolean rule that defines this user list. The rule consists of a list of
   * rule item groups and each rule item group consists of a list of rule items.
   * All the rule item groups are ORed or ANDed together for evaluation based on
   * rule.rule_type.
   * Required for creating an expression rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.UserListRuleInfo rule = 1;</code>
   */
  boolean hasRule();
  /**
   * <pre>
   * Boolean rule that defines this user list. The rule consists of a list of
   * rule item groups and each rule item group consists of a list of rule items.
   * All the rule item groups are ORed or ANDed together for evaluation based on
   * rule.rule_type.
   * Required for creating an expression rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.UserListRuleInfo rule = 1;</code>
   */
  com.google.ads.googleads.v0.common.UserListRuleInfo getRule();
  /**
   * <pre>
   * Boolean rule that defines this user list. The rule consists of a list of
   * rule item groups and each rule item group consists of a list of rule items.
   * All the rule item groups are ORed or ANDed together for evaluation based on
   * rule.rule_type.
   * Required for creating an expression rule user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.UserListRuleInfo rule = 1;</code>
   */
  com.google.ads.googleads.v0.common.UserListRuleInfoOrBuilder getRuleOrBuilder();
}
