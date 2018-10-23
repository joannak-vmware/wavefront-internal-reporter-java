package com.wavefront.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnull;

/**
 * Configuration for reporting telemetry to wavefront either through direct ingestion or through
 * wavefront proxy.
 *
 * @author Srujan Narkedamalli (snarkedamall@wavefront.com).
 */
public class WavefrontReportingConfig {

  public final static String proxyReporting = "proxy";
  public final static String directReporting = "direct";

  /**
   * Reporting mechanism to be used to send telemetry to Wavefront.
   */
  @JsonProperty
  @Nonnull
  private String reportingMechanism;

  /**
   * Wavefront server to be used for direct ingestion.
   */
  @JsonProperty
  private String server;

  /**
   *  Wavefront API token for direct ingestion.
   */
  @JsonProperty
  private String token;

  /**
   * Proxy host for proxy ingestion.
   */
  @JsonProperty
  private String proxyHost;

  /**
   * Proxy port for metrics ingestion.
   */
  @JsonProperty
  private int proxyMetricsPort;

  /**
   * Proxy port for distributions ingestion.
   */
  @JsonProperty
  private int proxyDistributionsPort;

  /**
   * Proxy port for trace/span ingestion.
   */
  @JsonProperty
  private int proxyTracingPort;

  @Nonnull
  public String getReportingMechanism() {
    return reportingMechanism;
  }

  public String getServer() {
    return server;
  }

  public String getToken() {
    return token;
  }

  public String getProxyHost() {
    return proxyHost;
  }

  public int getProxyMetricsPort() {
    return proxyMetricsPort;
  }

  public int getProxyDistributionsPort() {
    return proxyDistributionsPort;
  }

  public int getProxyTracingPort() {
    return proxyTracingPort;
  }
}