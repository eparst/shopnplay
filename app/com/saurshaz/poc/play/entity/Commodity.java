package com.saurshaz.poc.play.entity;

import javax.persistence.Id;

import play.db.ebean.Model;

public class Commodity extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -210089679990499198L;
	
	@Id
	private String itemCode;
	private String name;
	public Commodity(String itemCode, String name) {
		super();
		this.itemCode = itemCode;
		this.name = name;
	}
	public String getItemCode() {
		return itemCode;
	}
	public String getName() {
		return name;
	}
	
}