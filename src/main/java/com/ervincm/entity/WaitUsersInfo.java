package com.ervincm.entity;

public class WaitUsersInfo {
	private Integer id;
	private String userName;
	private String userMac;
	private String vipType;
	private String city;
	private String registerTime;
	private String deadlineTime;

	public WaitUsersInfo() {

	}

	public WaitUsersInfo(String userName, String userMac, String vipType,
			String city, String registerTime, String deadlineTime) {
		// super();
		this.userName = userName;
		this.userMac = userMac;
		this.vipType = vipType;
		this.city = city;
		this.registerTime = registerTime;
		this.deadlineTime = deadlineTime;
	}

	public WaitUsersInfo(RegisterUsersInfo registerInfo) {
		this.userName = registerInfo.getUsername();
		this.userMac = registerInfo.getUserMac();
		this.vipType = registerInfo.getVipType();
		this.city = registerInfo.getCity();
		this.registerTime = registerInfo.getRegisterTime();
		this.deadlineTime = registerInfo.getDeadlineTime();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMac() {
		return userMac;
	}

	public void setUserMac(String userMac) {
		this.userMac = userMac;
	}

	public String getVipType() {
		return vipType;
	}

	public void setVipType(String vipType) {
		this.vipType = vipType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	@Override
	public String toString() {
		return "WaitUsersInfo [id=" + id + ", userName=" + userName
				+ ", userMac=" + userMac + ", vipType=" + vipType + ", city="
				+ city + ", registerTime=" + registerTime + ", deadlineTime="
				+ deadlineTime + "]";
	}

}
