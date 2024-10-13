package com.nanshan.enb.web.model;

import java.io.Serializable;

public class EnbDataEntryView implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private PolicyView policy;
	
	private OwnerView owner;

	public PolicyView getPolicy() {
		return policy;
	}

	public void setPolicy(PolicyView policy) {
		this.policy = policy;
	}

	public OwnerView getOwner() {
		return owner;
	}

	public void setOwner(OwnerView owner) {
		this.owner = owner;
	}

}
