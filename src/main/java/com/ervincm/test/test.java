package com.ervincm.test;

import com.ervincm.dao.VipCountsInfoDao;
import com.ervincm.dao.WaitUsersInfoDao;
import com.ervincm.entity.RegisterUsersInfo;
import com.ervincm.entity.VipCount;
import com.ervincm.entity.VipCountsInfo;
import com.ervincm.entity.WaitUsersInfo;
import com.ervincm.service.Service;


@SuppressWarnings("AlibabaClassMustHaveAuthor")
public class test {

	public static void main(String[] args) {// 测试方法
	
		//addVipCountsInfo();
		//register();
		login();
		//logout();
		//changeVipCount();
		//changeVipPwd();
		//waitUsersInfo();
		if(Service.registerState==Service.ALREADY_REGISTER)
		{
			System.out.println("fail:"+"ALREADY_REGISTER");
			//Service.registerState=0;
		}
		if(Service.getVipState==Service.IN_WAIT_TABLE){
			System.out.println("fail:"+"IN_WAIT_TABLE");// 进入等待队列
			//Service.getVipState=0;
		}
		if(Service.getVipState==Service.WAIT_TABLE_FULL){
			System.out.println("fail:"+"WAIT_TABLE_FULL");// 次月的等待人数满，不再排队，
			//Service.getVipState=0;
		}
		if(Service.getVipState==Service.NO_REGISTER){
			System.out.println("fail:"+"NO_REGISTER");// 未注册为会员用户
			//Service.getVipState=0;
		}
		if(Service.getVipState==Service.NO_REGISTER_TENCENT_VIP){
			System.out.println("fail:"+"NO_REGISTER_TENCENT_VIP");
			//Service.getVipState=0;
		}
		if(Service.getVipState==Service.NO_REGISTER_IQIYI_VIP){
			System.out.println("fail:"+"NO_REGISTER_IQIYI_VIP");
		//	Service.getVipState=0;
		}
		if(Service.getVipState==Service.NO_REGISTER_YOUKU_VIP){
			System.out.println("fail:"+"NO_REGISTER_YOUKU_VIP");
			//Service.getVipState=0;
		}
		if(Service.getVipState==0){
			System.out.println("fail:"+"0");
			//Service.getVipState=0;
		}
		if(Service.switchTimes==Service.OUT_OF_SWITCH_TIMES){
			System.out.println("fail:"+"OUT_OF_SWITCH_TIMES");
			//Service.getVipState=0;
		}
		
		if(Service.changeVipState==Service.CHANGE_VIP_FAIL){
			System.out.println("fail:"+"CHANGE_VIP_FAIL");
			//Service.changeVipState=0;
		}
	}

	
	public static void waitUsersInfo() {
		WaitUsersInfoDao waitUsersInfoDao=new WaitUsersInfoDao();
		WaitUsersInfo waitUsersInfo=new WaitUsersInfo();
		waitUsersInfoDao.addUsers(waitUsersInfo);
	}
	
	public static void register() {
		for (int i = 1; i < 5; i++) {
			Service serv = new Service();
			String username="ervincm"+i;
			String userMac="2C-4D-54-EB-CF-0"+i;
			String ip="192.168.1.107";
			String vipType="tencent";
			String registerTime="2017-11-8";
			String deadlineTime="2017-12-8";
			String city="成都";
			RegisterUsersInfo registerInfo=new RegisterUsersInfo(username, userMac, ip, vipType, registerTime, deadlineTime, city);
//			RegisterInfo registerInfo = new RegisterInfo("ervincm0",
//					"2C-4D-54-EB-CF-00", "192.168.1.107", "tencent", "2017-11-8",
//					"2018-12-8", "成都");
			// 验证处理
			boolean reged = serv.registerVip(registerInfo);
			if (reged) {
				System.out.print("Succss");

				// response.sendRedirect("welcome.jsp");
			} else {
				System.out.print("Failed");
			}
		}
	
	}

	public static void login() {
		// 新建服务对象
		Service serv = new Service();

		// 验证处理
		VipCount vipCount = serv.loginVip("ervincm1", "2C-4D-54-EB-CF-012",
				"tencent");

		if (vipCount != null) {
			System.out.print("Succss");
			System.out.print(vipCount.toString());
			// response.sendRedirect("welcome.jsp");
		} else {
			System.out.print("Failed");
		}

	}
	public static void logout() {
		// 新建服务对象
		Service serv = new Service();

		// 验证处理
		Boolean flag = serv.logoutVip("ervincm1", "2C-4D-54-EB-CF-01",
				"tencent");

		if (flag) {
			System.out.print("Succss");
			
			// response.sendRedirect("welcome.jsp");
		} else {
			System.out.print("Failed");
		}

	}
	

	public static void changeVipCount() {
		// 新建服务对象
		Service serv = new Service();

		// 验证处理
		VipCount vipCount = serv.changeVipCount("ervincm0", "2C-4D-54-EB-CF-00",
				"tencent");
		if (vipCount != null) {
			System.out.print("Succss");
			System.out.print(vipCount.toString());
			// response.sendRedirect("welcome.jsp");
		} else {
			System.out.print("Failed");
		}
	}

	public static void changeVipPwd() {
		// 新建服务对象
		Service serv = new Service();

		// 验证处理
		Boolean flag = serv.changeVipPwd("3457478414", "1234abcd","tencent");
		if (flag) {
			System.out.print("Succss");
			// response.sendRedirect("welcome.jsp");
		} else {
			System.out.print("Failed");
		}
	}
	
	public static void addVipCountsInfo() {
		VipCountsInfoDao vipCountsInfoDao=new VipCountsInfoDao();
		String vipname[]={"3457478414","983852915","18030637727","15528123325","18030637727","youku2"};
		String vippwd[]={"1234abcd","ZHUmaomao123301","ZHUmaomao123301","1234abcd","ZHUmaomao123301","123"};
		String viptype[]={"tencent","tencent","iqiyi","iqiyi","youku","youku"};
		
		for (int i = 0; i < 6; i++) {
			String vipName=vipname[i];
			String vipPwd=vippwd[i];
			String type=viptype[i];
			String city="成都";
			VipCountsInfo vipCountsInfo=new VipCountsInfo(vipName, vipPwd, type, city, "0", "0", "0", "yes", "2017-12-8", "2018-12-8");
			vipCountsInfoDao.addVipCount(vipCountsInfo);
		}
	}
}
