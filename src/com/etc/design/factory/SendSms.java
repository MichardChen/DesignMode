package com.etc.design.factory;

public class SendSms implements Sender{

	@Override
	public void send() {
		System.out.println("send sms");
	}
}
