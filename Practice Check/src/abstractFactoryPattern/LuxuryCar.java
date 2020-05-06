package abstractFactoryPattern;

public class LuxuryCar extends Car{
	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Connecting to lucury car"); 	
	}
}
