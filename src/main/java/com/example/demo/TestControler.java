package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String savePurchaseData() {
		return "Helllo  ";
	}
}
