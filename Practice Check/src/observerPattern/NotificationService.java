package observerPattern;

import java.util.LinkedList;
import java.util.List;

public class NotificationService implements INotificationService{
	private List<INotificationObserver> observers = new LinkedList<>();
	@Override
	public void addSubscriber(INotificationObserver observer) {
		observers.add(observer);
		System.out.println("-----------------List Of Observers----------");
		observers.forEach(o -> System.out.println(o));
		System.out.println("--------------------------------------------");
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		System.out.println("-----------------List Of Observers----------");
		observers.forEach(o -> System.out.println(o));
		System.out.println("--------------------------------------------");
	}

	@Override
	public void notifySubscriber() {
		observers.forEach(o -> o.onServerDown());
	}

}
