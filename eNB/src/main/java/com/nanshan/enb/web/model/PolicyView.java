package com.nanshan.enb.web.model;

import java.util.Date;
import java.util.List;

public class PolicyView extends _View{
	
	private static final long serialVersionUID = 1L;
	
	private String policyNo;
	
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
