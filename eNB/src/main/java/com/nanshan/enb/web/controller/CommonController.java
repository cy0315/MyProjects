package com.nanshan.enb.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nanshan.enb.util.EnumUtils;

@RestController
@RequestMapping("common")
public class CommonController {
	
	@GetMapping("renderEnum")
	public Map<String, List<Map<String, String>>> renderEnum(){
		return EnumUtils.getAllEnumsInPackage("com.nanshan.enb.enums");
	}
	
}
