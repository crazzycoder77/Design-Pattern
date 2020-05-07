package com.designpattern.observerpattern;

public class App {

	public static void main(String[] args) {
		// Instantiating Notification Service
		INotificationService service = new NotificationService();

		// Instantiating Admins
		INotificationObserver admin1 = new Admin(service, "Foo", 101);
		INotificationObserver admin2 = new Admin(service, "Faa", 110);
		INotificationObserver admin3 = new Admin(service, "Boo", 98);

		// Admin Subscribing Service
		service.addObserver(admin1);
		service.addObserver(admin2);
		service.addObserver(admin3);

		// Sending Notification to Admin of Events with more than 100 Sold Ticket
		service.notifyObserver();

	}

}
