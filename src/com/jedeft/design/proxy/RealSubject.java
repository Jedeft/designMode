package com.jedeft.design.proxy;

/**
 * 
 * @Description: ����ģʽ��ʵ����
 * @author Jedeft
 * @date 2016��8��12�� ����9:25:21
 */
public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("����������");
	}

}
