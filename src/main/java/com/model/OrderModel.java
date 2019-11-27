package com.model;

import org.springframework.data.annotation.Id;

public class OrderModel {

	@Id
	private String id;
	private RequestModel rqst;
	private ServiceModel svc;
	private int quantity;
	private double price;
	private ServiceProvider sp;
	private UserBuyer ub;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RequestModel getRqst() {
		return rqst;
	}

	public void setRqst(RequestModel rqst) {
		this.rqst = rqst;
	}

	public ServiceModel getSvc() {
		return svc;
	}

	public void setSvc(ServiceModel svc) {
		this.svc = svc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ServiceProvider getSp() {
		return sp;
	}

	public void setSp(ServiceProvider sp) {
		this.sp = sp;
	}

	public UserBuyer getUb() {
		return ub;
	}

	public void setUb(UserBuyer ub) {
		this.ub = ub;
	}

}
