package abstractFactoryPattern;

public abstract class Car {
	protected CarType model;
	protected Location location;

	public Car(CarType model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}

	public abstract void construct();

	public CarType getMoodel() {
		return model;
	}

	public void setMoodel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "CarModel - " + model + " located in " + location;
	}

}
