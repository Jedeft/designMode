package com.jedeft.design.proxy;

/**
 * 
 * @Description: ������
 * @author Jedeft
 * @date 2016��8��12�� ����9:27:53
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
