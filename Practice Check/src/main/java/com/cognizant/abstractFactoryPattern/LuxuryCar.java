package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxuryCar extends Car {
	
	Location location = null;
	private static final Logger LOGGER=LoggerFactory.getLogger(LuxuryCar.class);
	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		this.location=location;
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("Connecting to LUXURY Car. From "+location);
	}

}
