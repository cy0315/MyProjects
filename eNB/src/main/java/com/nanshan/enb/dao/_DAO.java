package com.nanshan.enb.dao;

public interface _DAO<T> {
	public T findByParentId(Integer parentId);
}
