package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryProducer {
	private static final Logger LOGGER = LoggerFactory.getLogger(FactoryProducer.class);
	   public static AbstractFactory getFactory(Channel channel){
		  LOGGER.info(channel.toString());
	      if(channel.equals(Channel.ECommerceWebsite)){
	         return new EcommerceChannelFactory();       
	      }else{
	         return new TeleCallerChannelFactory();
	      }
	   }
	}