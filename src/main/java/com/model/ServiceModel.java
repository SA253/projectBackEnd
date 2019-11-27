package com.model;

public class ServiceModel {

	private String svcName;
	private String category;
	private String desc;
	private ServiceProvider sp;
	private UserBuyer ub;

	public String getSvcName() {
		return svcName;
	}

	public void setSvcName(String svcName) {
		this.svcName = svcName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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
