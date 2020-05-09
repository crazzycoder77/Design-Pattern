package com.cognizant.abstractFactoryPattern;

public class TeleCallerChannelFactory extends AbstractFactory {

	@Override
	Order getOrder(ProductType productType) {
		if(productType.equals(ProductType.ElectronicProducts))
			return new ElectronicOrder(Channel.TeleCallerAgentsApplication,productType);
		else if(productType.equals(ProductType.Furniture))
			return new FurnitureOrder(Channel.TeleCallerAgentsApplication, productType);
		else if(productType.equals(ProductType.Toys))
			return new ToysOrder(Channel.TeleCallerAgentsApplication, productType);
		else
			return null;
	}

}
