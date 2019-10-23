package com.stackroute.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/cgi/home")
	public ResponseEntity<?> myfile()
	{
		return new ResponseEntity<String>("Hai Payal Welcome",HttpStatus.OK);
	}

}
