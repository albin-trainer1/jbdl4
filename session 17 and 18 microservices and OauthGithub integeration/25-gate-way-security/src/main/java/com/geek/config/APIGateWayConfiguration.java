package com.geek.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class APIGateWayConfiguration {
//	//http://localhost:8080/feignclientForSecurityTest/pid/101/quantity/10
//	//Access this above URL with token to test security
//@Bean
//	public RouteLocator gateWayRouter(RouteLocatorBuilder builder) {
//		return builder.routes().
//				//route(p->p.path("/feignclientForSecurityTest/**").uri("lb://order-service")).
//				build();
//	}
//}
