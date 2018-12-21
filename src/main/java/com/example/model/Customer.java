package com.example.model;

import java.util.List;

public class Customer {
	private String id;
	private String name;
	private String description;
	private List<Cart> carts;

	public Customer(String id, String name, String description,
			List<Cart> carts) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.carts = carts;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer [id=%s, name=%s, description=%s, Carts=%s]", id,
				name, description, carts);
	}
}