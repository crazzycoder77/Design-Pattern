 package com.cognizant.observerPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JohnObserver implements INotificationObserver {
	String name = "John";
	private static final Logger LOGGER = LoggerFactory.getLogger(JohnObserver.class);
	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}
	public void onServerDown() {
		// TODO Auto-generated method stub
		LOGGER.info(name+" : Notification has been Recieved");
	}
	

}
