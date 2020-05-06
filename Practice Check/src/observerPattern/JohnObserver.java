package observerPattern;

public class JohnObserver implements INotificationObserver{
	String name="John";

	@Override
	public void onServerDown() {
		System.out.println(name + " recived a notification");

	}

	@Override
	public String toString() {
		return "JohnObserver [name=" + name + "]";
	}

}
