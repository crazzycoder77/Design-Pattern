package observerPattern;

public class Main {
	public static void main(String[] args) {
		INotificationObserver john = new JohnObserver();
		INotificationObserver steve = new SteveObserver();
		INotificationService service = new NotificationService();
		service.addSubscriber(john);
		service.addSubscriber(steve);
		service.notifySubscriber();
		service.removeSubscriber(steve);
		service.notifySubscriber();
	}
}
