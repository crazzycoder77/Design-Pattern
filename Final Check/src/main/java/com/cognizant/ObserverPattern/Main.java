package com.cognizant.ObserverPattern;

public class Main {
	public static void main(String[] args) {
		IAdminService adminService = new AdminService();
		IAdminObserver a1 = new AdminObserver(100);
		IAdminObserver a2 = new AdminObserver(120);
		IAdminObserver a3 = new AdminObserver(90);

		
		adminService.subScribe(a1);
		adminService.subScribe(a2);
		adminService.subScribe(a3);
		
		adminService.notificationToAll();
		
		adminService.unSubScribe(a2);

	}
}
