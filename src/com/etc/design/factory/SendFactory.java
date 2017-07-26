package com.etc.design.factory;
/**
 * �򵥹���ģʽ
 * ����ģʽ�ʺ��ڴ������������ҹ���һ���ӿ�
 * @author Chen Dang
 * @date 2017��7��26�� ����2:30:26 
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
