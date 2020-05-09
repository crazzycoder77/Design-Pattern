package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniCar extends Car {
	Location location = null;
	private static final Logger LOGGER=LoggerFactory.getLogger(MiniCar.class);
	public MiniCar(Location location) {
		super(CarType.MINI, location);
		this.location=location;
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.info("Connecting to MINI Car. from "+location);
	}

}
