package com.jedeft.design.observer;

/**
 * 
 * @Description: �۲��߾���ʵ����
 * @author Jedeft
 * @date 2016��8��12�� ����10:33:17
 */
public class ConcreteObserver implements Observer {

	private String name;
	private String observerState;
	private ConcreteSubject concreteSubject;

	public ConcreteObserver(String name, ConcreteSubject concreSubject) {
		this.name = name;
		this.concreteSubject = concreSubject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConcreteSubject getConcreteSubject() {
		return concreteSubject;
	}

	public void setConcreteSubject(ConcreteSubject concreteSubject) {
		this.concreteSubject = concreteSubject;
	}

	@Override
	public void update() {
		this.observerState = concreteSubject.getSubjectState();
		System.out.println("�۲���" + this.name + "����״̬�ǣ�" + this.observerState);
	}
}
