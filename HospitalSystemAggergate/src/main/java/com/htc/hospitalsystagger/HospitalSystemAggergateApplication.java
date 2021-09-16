package com.htc.hospitalsystagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@EnableHypermediaSupport(type=EnableHypermediaSupport.HypermediaType.HAL)
@EnableFeignClients("com.htc.hospitalsystagger.service")
@SpringBootApplication
public class HospitalSystemAggergateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalSystemAggergateApplication.class, args);
	}

}
