package io.viks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
import io.viks.configuration.LimitConfiguration;  

@RestController  
public class LimitsConfigurationController   
{  
	@Autowired
	LimitConfiguration limitConfig;
	
	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
		return limitConfig;  
	}  
}  