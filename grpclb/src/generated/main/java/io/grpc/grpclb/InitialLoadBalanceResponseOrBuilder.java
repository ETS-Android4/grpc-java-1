// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: load_balancer.proto

package io.grpc.grpclb;

public interface InitialLoadBalanceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.lb.v1.InitialLoadBalanceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is an application layer redirect that indicates the client should use
   * the specified server for load balancing. When this field is non-empty in
   * the response, the client should open a separate connection to the
   * load_balancer_delegate and call the BalanceLoad method. Its length should
   * be less than 64 bytes.
   * </pre>
   *
   * <code>string load_balancer_delegate = 1;</code>
   */
  java.lang.String getLoadBalancerDelegate();
  /**
   * <pre>
   * This is an application layer redirect that indicates the client should use
   * the specified server for load balancing. When this field is non-empty in
   * the response, the client should open a separate connection to the
   * load_balancer_delegate and call the BalanceLoad method. Its length should
   * be less than 64 bytes.
   * </pre>
   *
   * <code>string load_balancer_delegate = 1;</code>
   */
  com.google.protobuf.ByteString
      getLoadBalancerDelegateBytes();

  /**
   * <pre>
   * This interval defines how often the client should send the client stats
   * to the load balancer. Stats should only be reported when the duration is
   * positive.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
   */
  boolean hasClientStatsReportInterval();
  /**
   * <pre>
   * This interval defines how often the client should send the client stats
   * to the load balancer. Stats should only be reported when the duration is
   * positive.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
   */
  com.google.protobuf.Duration getClientStatsReportInterval();
  /**
   * <pre>
   * This interval defines how often the client should send the client stats
   * to the load balancer. Stats should only be reported when the duration is
   * positive.
   * </pre>
   *
   * <code>.google.protobuf.Duration client_stats_report_interval = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getClientStatsReportIntervalOrBuilder();
}
