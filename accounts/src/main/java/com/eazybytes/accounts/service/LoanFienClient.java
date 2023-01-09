package com.eazybytes.accounts.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eazybytes.accounts.model.Customer;
import com.eazybytes.accounts.model.Loans;

@FeignClient("loans")
public interface LoanFienClient {

	@RequestMapping(method=RequestMethod.POST, value="myLoans", consumes="application/json")
	List<Loans> getLoanDetail(@RequestBody Customer customer);
}
