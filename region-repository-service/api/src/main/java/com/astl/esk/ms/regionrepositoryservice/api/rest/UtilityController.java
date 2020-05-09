package com.astl.esk.ms.regionrepositoryservice.api.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UtilityController {

	@RequestMapping(
			value = "/ping",
			produces = {MediaType.APPLICATION_JSON_VALUE}, 
			method = RequestMethod.GET)
	public ResponseEntity<String> ping(){
		String message = "Running";
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
}

