package com.nanshan.enb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanshan.enb.model.Policy;

public interface PolicyDAO extends JpaRepository<Policy, Integer> {
	public Policy findByPolicyNo(String policyNo);
}
