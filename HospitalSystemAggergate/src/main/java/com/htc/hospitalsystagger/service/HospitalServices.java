package com.htc.hospitalsystagger.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.hospitalsystagger.entity.Patient;

@Component
@FeignClient(url = "http://localhost:8086",name="HospitalService")
public interface HospitalServices {

	@GetMapping("api/patients/{id}")
	Patient getPatientById(@PathVariable("id") Long id);
}

