package com.cognizant.abstractFactoryPattern;

public class EcommerceChannelFactory extends AbstractFactory {

	@Override
	Order getOrder(ProductType productType) {
		if(productType.equals(ProductType.ElectronicProducts))
			return new ElectronicOrder(Channel.ECommerceWebsite,productType);
		else if(productType.equals(ProductType.Furniture))
			return new FurnitureOrder(Channel.ECommerceWebsite, productType);
		else if(productType.equals(ProductType.Toys))
			return new ToysOrder(Channel.ECommerceWebsite, productType);
		else
			return null;
	}

}
