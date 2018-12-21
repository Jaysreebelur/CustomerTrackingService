package com.example.model;

public class Cart {
	private String cartID;
	private String item;
	private String description;
	private int qty;

	
	public Cart() {

	}

	public Cart(String cartID, String item, String description, int qty) {
		super();
		this.cartID = cartID;
		this.item = item;
		this.description = description;
		this.qty = qty;
	}

	public String getCartID() {
		return cartID;
	}

	public void setCartID(String cartID) {
		this.cartID = cartID;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Cart [cartID=" + cartID + ", item=" + item + ", description=" + description + ", qty=" + qty + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartID == null) ? 0 : cartID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (cartID == null) {
			if (other.cartID != null)
				return false;
		} else if (!cartID.equals(other.cartID))
			return false;
		return true;
	}

}
