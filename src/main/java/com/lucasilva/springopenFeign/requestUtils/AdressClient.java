package com.lucasilva.springopenFeign.requestUtils;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.lucasilva.springopenFeign.dto.AdressModelResponse;

@FeignClient(url = "https://viacep.com.br/ws", name = "ADRESS-CLIENT")
public interface AdressClient {
	
	 @GetMapping(value = "/{zipCode}/json")
	 public AdressModelResponse getAdress(@PathVariable String zipCode);
}
