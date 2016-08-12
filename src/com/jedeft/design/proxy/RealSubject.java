package com.jedeft.design.proxy;

/**
 * 
 * @Description: 代理模式中实体类
 * @author Jedeft
 * @date 2016年8月12日 下午9:25:21
 */
public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("真正的请求");
	}

}
