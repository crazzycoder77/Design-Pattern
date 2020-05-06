package abstractFactoryPattern;

public class CarProducer {
	public static CarFactory getCarFactoty(String model) {
		switch (model) {
		case "LUXURY": {
			return new LuxuryCarFactory();
		}
		case "MINI": {
			return new MiniCarFactory();
		}
		case "MICRO": {
			return new MicroCarFactory();
		}
		default: {
			return null;
		}
		}
	}
}
