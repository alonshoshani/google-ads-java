// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/customer_client_link_service.proto

package com.google.ads.googleads.v0.services;

public interface MutateCustomerClientLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.services.MutateCustomerClientLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer whose customer link are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer whose customer link are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The operation to perform on the individual CustomerClientLink.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
   */
  boolean hasOperation();
  /**
   * <pre>
   * The operation to perform on the individual CustomerClientLink.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
   */
  com.google.ads.googleads.v0.services.CustomerClientLinkOperation getOperation();
  /**
   * <pre>
   * The operation to perform on the individual CustomerClientLink.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.services.CustomerClientLinkOperation operation = 2;</code>
   */
  com.google.ads.googleads.v0.services.CustomerClientLinkOperationOrBuilder getOperationOrBuilder();
}
