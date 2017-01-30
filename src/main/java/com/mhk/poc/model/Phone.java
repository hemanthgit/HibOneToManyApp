package com.mhk.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHONE")
public class Phone {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long phoneId;
	
	@Column(name = "TYPE", nullable = false)
	private String phoneType;
	
	@Column(name = "PHONE_NUM", nullable = false)
	private Integer phoneNumber;

	public Phone() {
	}

	public Phone(String phoneType, Integer phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}
	
	public long getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
	public Integer getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}