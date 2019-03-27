package com.zuxia.entity;

import lombok.Data;

@Data
public class User {
	private int id;
	private String name;
	private String password;
	private String number;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", number=" + number + "]";
	}

}
