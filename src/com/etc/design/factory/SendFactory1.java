package com.etc.design.factory;
/**
 * 多个工厂模式，当传递的字符串出错，就会返回null，而工厂模式
 * 应该提供多个工厂对象
 * @author Chen Dang
 * @date 2017年7月26日 下午2:54:46 
 * @version 1.0
 * @Description:
 */
public class SendFactory1 {

	public Sender produreSms(){
		return new SendSms();
	}
	
	public Sender produreEmail(){
		return new SendEmail();
	}
}
