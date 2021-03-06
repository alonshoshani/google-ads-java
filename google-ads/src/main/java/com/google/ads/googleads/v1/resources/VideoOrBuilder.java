// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/video.proto

package com.google.ads.googleads.v1.resources;

public interface VideoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.Video)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the video.
   * Video resource names have the form:
   * `customers/{customer_id}/videos/{video_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the video.
   * Video resource names have the form:
   * `customers/{customer_id}/videos/{video_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 2;</code>
   */
  com.google.protobuf.StringValue getId();
  /**
   * <pre>
   * The ID of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The owner channel id of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue channel_id = 3;</code>
   */
  boolean hasChannelId();
  /**
   * <pre>
   * The owner channel id of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue channel_id = 3;</code>
   */
  com.google.protobuf.StringValue getChannelId();
  /**
   * <pre>
   * The owner channel id of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue channel_id = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getChannelIdOrBuilder();

  /**
   * <pre>
   * The duration of the video in milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value duration_millis = 4;</code>
   */
  boolean hasDurationMillis();
  /**
   * <pre>
   * The duration of the video in milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value duration_millis = 4;</code>
   */
  com.google.protobuf.Int64Value getDurationMillis();
  /**
   * <pre>
   * The duration of the video in milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value duration_millis = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDurationMillisOrBuilder();

  /**
   * <pre>
   * The title of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue title = 5;</code>
   */
  boolean hasTitle();
  /**
   * <pre>
   * The title of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue title = 5;</code>
   */
  com.google.protobuf.StringValue getTitle();
  /**
   * <pre>
   * The title of the video.
   * </pre>
   *
   * <code>.google.protobuf.StringValue title = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTitleOrBuilder();
}
