package com.etc.design.factory;

/**
 * �����ɷ��͵���;��巢�͵��࣬���뿪����󼯳��ڹ������в�����
 * ����������µĸı䣬ֱ���������½�2����Ӧ���࣬����ı�ԭ��
 * ���ࡣ
 * @author Chen Dang
 * @date 2017��7��26�� ����4:12:49 
 * @version 1.0
 * @Description:
 */
public class AbstractEmailFactory implements Product{

	@Override
	public Sender produre() {
		return new SendEmail();
	}

}
