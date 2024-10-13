package com.nanshan.enb.model;

import java.util.Date;

import com.nanshan.enb.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Owner extends _Model {
	
	private static final long serialVersionUID = 1L;
	
	public Owner() {
		
	}
	
	private String taxId;
	
	private String firstName;
	
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	private Date birthDt;
	
	@Enumerated(EnumType.STRING) // 或使用 EnumType.ORDINAL
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
