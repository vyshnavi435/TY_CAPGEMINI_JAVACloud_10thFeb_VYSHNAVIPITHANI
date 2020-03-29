package com.tyss.capgemini.beans;

public class Assets {
	
	private int id;
	private String title;
	private String category;
	private int quantity;
	private double price;
	private String additional_details;
	private double totalprice = price*quantity;
	public int getId() {
		return id;
	}
	public Assets(Integer id,String title, String category, int quantity, double price,double totalprice,String additional_details) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.totalprice = totalprice;
		this.additional_details = additional_details;
	}
	@Override
	public String toString() {
		return "Assets [id=" + id + ", title=" + title + ", category=" + category + ", quantity=" + quantity
				+ ", price=" + price + ", additional_details=" + additional_details + ", totalprice=" + totalprice
				+ "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal_price() {
		return totalprice;
	}
	public void setTotal_price(double total_price) {
		this.totalprice = total_price;
	}
	public String getAdditional_details() {
		return additional_details;
	}
	public void setAdditional_details(String additional_details) {
		this.additional_details = additional_details;
	}

}



