package com.etc.design.factory;
/**
 * �������ģʽ�������ݵ��ַ��������ͻ᷵��null��������ģʽ
 * Ӧ���ṩ�����������
 * @author Chen Dang
 * @date 2017��7��26�� ����2:54:46 
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
