package com.etc.design.factory;

/**
 * ��̬����ģʽ
 * @author Chen Dang
 * @date 2017��7��26�� ����2:59:04 
 * @version 1.0
 * @Description:
 */
public class StaticFactory {

	public static Sender produreMail(){
		return new SendEmail();
	}
	
	public static Sender produreSms(){
		return new SendSms();
	}
}
