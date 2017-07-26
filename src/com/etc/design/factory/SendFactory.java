package com.etc.design.factory;
/**
 * 简单工厂模式
 * 工厂模式适合于大量创建，而且共用一个接口
 * @author Chen Dang
 * @date 2017年7月26日 下午2:30:26 
 * @version 1.0
 * @Description:
 */
public class SendFactory {

	public Sender newSender(String type){
		
		if("sms".equals(type)){
			return new SendSms();
		}else if("email".equals(type)){
			return new SendEmail();
		}else{
			return null;
		}
	}
}
