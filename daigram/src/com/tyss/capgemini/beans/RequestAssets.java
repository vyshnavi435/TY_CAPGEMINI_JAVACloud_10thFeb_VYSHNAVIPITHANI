package com.tyss.capgemini.beans;

public class RequestAssets {
	
	private int assetId;
	private int requestId;
	private String assetName;
	private String category;
	private int quantity;
	private double price;
	private boolean status;
	static int count=1000;
	
	public RequestAsset(int assetId,int requestId,String assetName, String category, int quantity, double price, boolean status) {
		super();
		status= false;
		requestId = count++;
		this.assetId = assetId;
		this.requestId = requestId;
		this.assetName = assetName;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	@Override
	public String toString() {
		return "RequestAsset [assetId=" + assetId + ", assetName=" + assetName + ", category=" + category
				+ ", quantity=" + quantity + ", price=" + price + ", status=" + status + "]";
	}
	
	

}
