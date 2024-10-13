package com.nanshan.enb.web.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class _View implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer pkId;
	
	private Integer parentId;
	
	public Integer getPkId() {
		return pkId;
	}

	public void setPkId(Integer pkId) {
		this.pkId = pkId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	public String toString() {
		return
		 ToStringBuilder.reflectionToString(this, 
				 ToStringStyle.MULTI_LINE_STYLE);
	}

}
