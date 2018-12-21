package com.example.service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Cart;
import com.example.model.Customer;

@Component
public class CustomerService {

	private static List<Customer> customers = new ArrayList<>();

	static {
		// Initializing Data
		Cart cart1 = new Cart("1111", "Mobile", "IPhoneX", 1);
		Cart cart2 = new Cart("2222", "TV", "LG-55 inch", 1);
		Cart cart3 = new Cart("3333", "GIFT", "Farewell Voucher", 2);
		Cart cart4 = new Cart("4444", "Toiletary", "Shampoo", 1);
		
		Customer customer1 = new Customer("Cust1", "Tony Clinton", "VIP", new ArrayList<>(Arrays.asList(cart2,cart1)));
		Customer customer2 = new Customer("Cust2", "Johnson Gary", "GNL", new ArrayList<>(Arrays.asList(cart2,cart4,cart3)));

		customers.add(customer1);
		customers.add(customer2);
	}

	public List<Customer> retrieveAllCustomers() {
		return customers;
	}

	public Customer retrieveCustomer(String customerID) {
		for (Customer customer : customers) {
			if (customer.getId().equals(customerID)) {
				return customer;
			}
		}
		return null;
	}

	public List<Customer> retrieveCustomer(){
		return customers;
	}
	public List<Cart> retrieveCarts(String customerID) {
		Customer customer = retrieveCustomer(customerID);

		

		return customer.getCarts();
	}

	public Cart retrieveCarts(String customerID, String cartID) {
		Customer customer = retrieveCustomer(customerID);

		if (customer == null) {
			return null;
		}

		for (Cart cart : customer.getCarts()) {
			if (cart.getCartID().equals(cartID)) {
				return cart;
			}
		}

		return null;
	}

	private SecureRandom random = new SecureRandom();

	public Cart addCart(String customerID, Cart cart) {
		Customer customer = retrieveCustomer(customerID);

		if (customer == null) {
			return null;
		}

		String randomId = new BigInteger(130, random).toString(32);
		cart.setCartID(randomId);

		customer.getCarts().add(cart);

		return cart;
	}
}
