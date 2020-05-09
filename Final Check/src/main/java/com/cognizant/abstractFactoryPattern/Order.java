package com.cognizant.abstractFactoryPattern;

public abstract class Order {
	Channel channel = null;
	ProductType productType = null;
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public Order(Channel channel, ProductType productType) {
		super();
		this.channel = channel;
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "Order [channel=" + channel + ", productType=" + productType + "]";
	}
	
	abstract void processOrder();
}
