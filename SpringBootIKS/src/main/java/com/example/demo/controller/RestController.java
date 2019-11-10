package com.example.demo.controller;

import java.sql.SQLException;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	

	
	@GetMapping(value = "/api/test", produces = "application/json")
	public String getUsages() throws SQLException {
		return "Hello World";
	}

	

}
