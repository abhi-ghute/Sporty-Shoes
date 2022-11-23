package com.sporty.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CartEntity {

	@Id
	@GeneratedValue
	private Integer id;
	private String email;
	private String shooetype;
	private String date;

	public String getEmail() {
			return email;
		}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getShooetype() {
		return shooetype;
	}

	public void setShooetype(String shooetype) {
		this.shooetype = shooetype;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}

}
