package com.microservices.processor_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProcessorMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessorMicroserviceApplication.class, args);
	}

}
