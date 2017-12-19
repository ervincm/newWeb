package com.ervincm.entity;
//vipCountsInfo中的User类
public class VipUser {
	private String userName;
	private String userMac;
	private String UseVipState;
	private String registerTime;
	private String deadlineTime;

	
	public  VipUser(){
		
	}

	

	public VipUser(String userName, String userMac, String useVipState,
			String registerTime, String deadlineTime) {
		//super();
		this.userName = userName;
		this.userMac = userMac;
		UseVipState = useVipState;
		this.registerTime = registerTime;
		this.deadlineTime = deadlineTime;
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

	public String getUseVipState() {
		return UseVipState;
	}



	public void setUseVipState(String useVipState) {
		UseVipState = useVipState;
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



	public void setDeadlineTime(String deadlineTime1) {
		this.deadlineTime = deadlineTime1;
	}



	@Override
	public String toString() {
		return "VipUser [userName=" + userName + ", userMac=" + userMac
				+ ", UseVipState=" + UseVipState + ", registerTime="
				+ registerTime + ", deadlineTime=" + deadlineTime + "]";
	}



	
}
