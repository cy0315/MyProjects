package com.nanshan.enb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanshan.enb.model.Owner;

public interface OwnerDAO extends JpaRepository<Owner, Integer> {
	public Owner findByParentId(Integer parentId);
}
