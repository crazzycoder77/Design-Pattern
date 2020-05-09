package com.cognizant.abstractFactoryPattern;

public abstract class AbstractFactory {
	   abstract Order getOrder(ProductType productType);
}