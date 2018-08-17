package com.frederico.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/public/conversao")
public class ConversaoTempResource {

	@GetMapping("/{graus}")
	public ResponseEntity<?> GrausParaFahrenheit(@PathVariable float graus) {
		
		float fahrenheit = (float) (graus * 1.8 + 32);
		
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.TEXT_PLAIN).body(graus + "ºC equivale a " + fahrenheit + "ºF");
	}
	
}