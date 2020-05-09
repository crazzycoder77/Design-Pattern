package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FurnitureOrder extends Order {
	private static final Logger LOGGER = LoggerFactory.getLogger(FurnitureOrder.class);
	public FurnitureOrder(Channel channel, ProductType productType) {
		super(channel, productType);
		processOrder();
	}

	@Override
	void processOrder() {
		LOGGER.info("Furniture Order is Placed.");
	}

}
