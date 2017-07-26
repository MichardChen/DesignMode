package com.etc.design.factory;

public class FactoryTest1 {

	public static void main(String[] args){
		SendFactory1 sf = new SendFactory1();
		Sender sd = sf.produreEmail();
		sd.send();
	}
}
