package com.etc.design.factory;

public class FactoryTest2 {

	public static void main(String[] args){
		Sender sender = StaticFactory.produreMail();
		sender.send();
		Sender sd = StaticFactory.produreSms();
		sd.send();
	}
}
