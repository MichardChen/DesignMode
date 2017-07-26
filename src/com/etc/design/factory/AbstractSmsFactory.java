package com.etc.design.factory;

public class AbstractSmsFactory implements Product{

	@Override
	public Sender produre() {
		return new SendSms();
	}

}
