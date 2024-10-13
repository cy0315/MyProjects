package com.nanshan.enb.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass
public class _Model implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public _Model() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pkId;
	
	private Integer parentId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTs;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTs;
	
	@PrePersist
	public void onPersist() {
		this.createTs=new Date();
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updateTs=new Date();
	}

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

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createTs) {
		this.createTs = createTs;
	}

	public Date getUpdateTs() {
		return updateTs;
	}

	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}
	
	public String toString() {
		return
		 ToStringBuilder.reflectionToString(this, 
				 ToStringStyle.MULTI_LINE_STYLE);
	}

}
