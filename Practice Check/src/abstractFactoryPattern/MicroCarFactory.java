package abstractFactoryPattern;

public class MicroCarFactory implements CarFactory{

	@Override
	public Car getCar(String loc) {
		Location location;
		switch (loc) {
		case "USA": {
			location = Location.USA;
			break;
		}
		case "INDIA": {
			location = Location.INDIA;
			break;
		}
		default: {
			location = Location.DEFAULT;
		}
		}
		return new MicroCar(location);
	}

}
