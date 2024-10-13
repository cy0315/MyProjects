package com.nanshan.enb.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Policy extends _Model{
	
	private static final long serialVersionUID = 1L;

	public Policy() {
	
	}
	
	private String policyNo;
	
	@Temporal(TemporalType.DATE)
	private Date applyDt;
	
	private List<String> insuredDeclaration;

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public Date getApplyDt() {
		return applyDt;
	}

	public void setApplyDt(Date applyDt) {
		this.applyDt = applyDt;
	}

	public List<String> getInsuredDeclaration() {
		return insuredDeclaration;
	}

	public void setInsuredDeclaration(List<String> insuredDeclaration) {
		this.insuredDeclaration = insuredDeclaration;
	}

	
	
	
}
