package com.etc.design.factory;

public class FactoryTest {

	public static void main(String[] args){
		
		SendFactory sf = new SendFactory();
		Sender sender = sf.newSender("sms");
		sender.send();
	}
}
