package com.sporty.model;

public class AddShoes {

	private String shoesType;
	private String MWK="ALL";
	private String name;
	private String size;
	private String price;
	String imagePath;
	
	public String getShoesType() {
		return shoesType;
	}
	public void setShoesType(String shoesType) {
		this.shoesType = shoesType;
	}
	public String getMWK() {
		return MWK;
	}
	public void setMWK(String mWK) {
		MWK = mWK;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImagePath() {
		return imagePath;
	}
}
