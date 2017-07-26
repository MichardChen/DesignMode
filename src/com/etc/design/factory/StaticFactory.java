package com.etc.design.factory;

/**
 * 静态工厂模式
 * @author Chen Dang
 * @date 2017年7月26日 下午2:59:04 
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
