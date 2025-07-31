package com;

public class Product {

	int productId;
	String productName;
	int quantity;
	int price;
	
//	public roduct()
//	{
//		
//	}
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int quantity, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
		

	
}
