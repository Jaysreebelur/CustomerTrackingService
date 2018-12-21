package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Cart;
import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/customers/all")
	public List<Customer> getAllCustomers() {
		return customerService.retrieveCustomer();
	}
	
	@PostMapping("/customers/cart")
	public List<Cart> retrieveCartForCustomer(@RequestBody String customerID) {
		return customerService.retrieveCarts(customerID);
	}


}
