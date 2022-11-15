package com.sporty.model;

import org.springframework.web.multipart.MultipartFile;

public class AddShoes {

	private String shoesType;
	private String MWK;
	private String name;
	private String size;
	private String price;
	MultipartFile image;
	
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
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public MultipartFile getImage() {
		return image;
	}
}
