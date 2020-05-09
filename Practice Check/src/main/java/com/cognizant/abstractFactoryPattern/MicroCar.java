package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroCar extends Car {
	Location location = null;
	private static final Logger LOGGER=LoggerFactory.getLogger(MicroCar.class);
	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		this.location=location;
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("Connecting to MICRO Car. from "+location);
	}

}
