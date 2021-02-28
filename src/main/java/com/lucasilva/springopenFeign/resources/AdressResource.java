package com.lucasilva.springopenFeign.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasilva.springopenFeign.dto.AdressModelResponse;
import com.lucasilva.springopenFeign.requestUtils.AdressClient;

@RestController
@RequestMapping(value = "/adress")
public class AdressResource {

	@Autowired
	private AdressClient adressClient;
	
	@GetMapping(value="/{zipCode}")
	public AdressModelResponse getAdress(@PathVariable String zipCode) {
		return adressClient.getAdress(zipCode);
	}
}
