package com.etc.design.factory;

/**
 * 把生成发送的类和具体发送的类，分离开，最后集成在工厂类中操作。
 * 这样如果有新的改变，直接再重新新建2个对应的类，无需改变原来
 * 的类。
 * @author Chen Dang
 * @date 2017年7月26日 下午4:12:49 
 * @version 1.0
 * @Description:
 */
public class AbstractEmailFactory implements Product{

	@Override
	public Sender produre() {
		return new SendEmail();
	}

}
