package com.etc.design.factory;

public class AbstractFactoryTest {

	public static void main(String[] args){
		AbstractEmailFactory af = new AbstractEmailFactory();
		Sender se = af.produre();
		se.send();
		
		AbstractSmsFactory as = new AbstractSmsFactory();
		Sender s = as.produre();
		s.send();
	}
}
