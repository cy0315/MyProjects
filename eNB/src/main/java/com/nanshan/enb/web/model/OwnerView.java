package com.nanshan.enb.web.model;

import java.util.Date;

import com.nanshan.enb.enums.Gender;

public class OwnerView extends _View{
	
	private static final long serialVersionUID = 1L;
	
	private String taxId;
	
	private String firstName;
	
	private String lastName;
	
	private Date birthDt;

    private Gender gender;

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDt() {
		return birthDt;
	}

	public void setBirthDt(Date birthDt) {
		this.birthDt = birthDt;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
