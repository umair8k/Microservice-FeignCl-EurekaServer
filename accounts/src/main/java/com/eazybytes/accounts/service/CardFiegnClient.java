package com.eazybytes.accounts.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eazybytes.accounts.model.Cards;
import com.eazybytes.accounts.model.Customer;

@FeignClient("cards")
public interface CardFiegnClient {
	
	@RequestMapping(method = RequestMethod.POST,value = "myCards", consumes="application/json")
List<Cards> getCardDetails(@RequestBody Customer customer);

}
