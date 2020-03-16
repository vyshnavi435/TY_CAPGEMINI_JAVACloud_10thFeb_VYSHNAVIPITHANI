package com.capgemini.assetmanagement.beans;

public class AssetBean {
	private int assetId;
	private String title;
	private String category;
	private int quantity;
	private double price;

	public AssetBean(int assetId, String title, String category, int quantity, double price) {
		super();
		this.assetId = assetId;
		this.title = title;
		this.category = category;
		this.quantity = quantity;
		this.price = price;

	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
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

}
