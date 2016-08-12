package com.jedeft.design.observer;

/**
 * 
 * @Description: 观察者具体实现类
 * @author Jedeft
 * @date 2016年8月12日 下午10:33:17
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
		System.out.println("观察者" + this.name + "的新状态是：" + this.observerState);
	}
}
