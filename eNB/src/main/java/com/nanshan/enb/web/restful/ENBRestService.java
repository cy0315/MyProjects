package com.nanshan.enb.web.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ENBRestService")
public class ENBRestService {
	
	@GetMapping("sayHello")
	public String sayHello() {
		return "Hello, this is ENBDataEntryController";
	}
}
