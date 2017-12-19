package com.ervincm.entity;

import net.sf.json.JSONObject;

//vipUserInfo中的Count类
public class VipCount {

	private String name;
	private String password;
	private String useState;
	private String registerTime;
	private String deadlineTime;
	private String isvip;
	
	public VipCount(){
		
	}



	public VipCount(String name, String password, String useState,
			String registerTime, String deadlineTime, String isvip) {
		//super();
		this.name = name;
		this.password = password;
		this.useState = useState;
		this.registerTime = registerTime;
		this.deadlineTime = deadlineTime;
		this.isvip = isvip;
	}



	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public String getDeadlineTime() {
		return deadlineTime;
	}

	public void setDeadlineTime(String deadlineTime) {
		this.deadlineTime = deadlineTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUseState() {
		return useState;
	}

	public void setUseState(String useState) {
		this.useState = useState;
	}

	public String getIsvip() {
		return isvip;
	}



	public void setIsvip(String isvip) {
		this.isvip = isvip;
	}



	@Override
	public String toString() {
	
		return JSONObject.fromObject(this).toString();
//		return "VipCount [name=" + name + ", password=" + password
//				+ ", useState=" + useState + ", registerTime=" + registerTime
//				+ ", deadlineTime=" + deadlineTime + ", isvip=" + isvip + "]";
	}



	


	
}
