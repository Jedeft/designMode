package com.jedeft.design.observer;

/**
 * 
 * @Description: �۲���ģʽ�ֽз���-����ģʽ
 * �ð汾�Ĺ۲���ģʽ��δ��ȫ��������������ڹ۲��ߵĳ����ࣨ����ӿڣ�
 * ��ȫ����Ĺ۲���ģʽΪ�۲���ģʽ+����ģʽ��ͨ������ģʽʵ��.net�е�ί��Ч��
 * @author Jedeft
 * @date 2016��8��12�� ����10:21:17
 */
public class Main {
	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		concreteSubject.attach(new ConcreteObserver("С��", concreteSubject));
		concreteSubject.attach(new ConcreteObserver("С��", concreteSubject));
		concreteSubject.attach(new ConcreteObserver("С��", concreteSubject));
		
		concreteSubject.setSubjectState("ABC");
		
		concreteSubject.concreteNotify();
	}
}
