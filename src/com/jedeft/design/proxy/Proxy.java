package com.jedeft.design.proxy;

/**
 * 
 * @Description: 代理类
 * @author Jedeft
 * @date 2016年8月12日 下午9:27:53
 */
public class Proxy extends Subject {

	private RealSubject realSubject;

	@Override
	public void request() {
		if (this.realSubject == null) {
			this.realSubject = new RealSubject();
		}
		this.realSubject.request();
	}

}
