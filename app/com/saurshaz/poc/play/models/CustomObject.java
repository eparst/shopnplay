package com.saurshaz.poc.play.models;

import java.io.Serializable;

public class CustomObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2792971121562906368L;
	
	private String bigDay;
	private String occupation;
	private String name;

	public CustomObject(final String name,final String occupation,final String bigDay) {
		this.name=name;
		this.occupation=occupation;
		this.bigDay=bigDay;
	}

	public String getBigDay() {
		return bigDay;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getName() {
		return name;
	}

	

}
