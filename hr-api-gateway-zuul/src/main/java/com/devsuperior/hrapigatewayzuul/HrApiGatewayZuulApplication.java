package com.devsuperior.hrapigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableCircuitBreaker
@EnableZuulProxy
@SpringBootApplication
public class HrApiGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrApiGatewayZuulApplication.class, args);
    }

}
