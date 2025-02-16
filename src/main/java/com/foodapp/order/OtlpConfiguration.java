package com.foodapp.order;

import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtlpConfiguration {

  @Bean
  OtlpHttpSpanExporter otlpHttpSpanExporter(@Value("${tracing.url}") String url) {
    System.out.println("OtlpHttpSpanExporter is created with url " + url);
    return OtlpHttpSpanExporter.builder().setEndpoint(url).build();
  }
}
