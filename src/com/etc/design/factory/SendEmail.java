package com.etc.design.factory;

public class SendEmail implements Sender{

	@Override
	public void send() {
		System.out.println("send email");
	}

}
