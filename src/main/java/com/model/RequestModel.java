package com.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class RequestModel {

	@Id
	private String id;
	private String name;
	private Date expectedDate;
	private String category;
	private int quantity;
	private String desc;
	private UserBuyer ub;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public UserBuyer getUb() {
		return ub;
	}

	public void setUb(UserBuyer ub) {
		this.ub = ub;
	}

}
