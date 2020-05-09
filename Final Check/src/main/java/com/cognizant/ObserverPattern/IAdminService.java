package com.cognizant.ObserverPattern;

public interface IAdminService {
	void subScribe(IAdminObserver adminObserver);
	void unSubScribe(IAdminObserver adminObserver);
	void notificationToAll();
}
