package com.jedeft.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Description: ֪ͨ�߳�����
 * @author Jedeft
 * @date 2016��8��12�� ����10:31:06
 */
public abstract class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void detach(Observer observer) {
		this.observers.remove(observer);
	}
	
	//֪ͨ
	public void concreteNotify() {
		for(Observer observer : this.observers) {
			observer.update();
		}
	}
}
