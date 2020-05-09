package com.cognizant.abstractFactoryPattern;

public class Main {

	public static void main(String[] args) {
		AbstractFactory ab1 = FactoryProducer.getFactory(Channel.ECommerceWebsite);
		ab1.getOrder(ProductType.ElectronicProducts);
		ab1.getOrder(ProductType.Furniture);
		ab1.getOrder(ProductType.Toys);
		AbstractFactory ab2 = FactoryProducer.getFactory(Channel.TeleCallerAgentsApplication);
		ab2.getOrder(ProductType.ElectronicProducts);
		ab2.getOrder(ProductType.Furniture);
		ab2.getOrder(ProductType.Toys);
	}

}
