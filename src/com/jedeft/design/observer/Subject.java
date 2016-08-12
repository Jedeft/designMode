package com.jedeft.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Description: 通知者抽象类
 * @author Jedeft
 * @date 2016年8月12日 下午10:31:06
 */
public abstract class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void detach(Observer observer) {
		this.observers.remove(observer);
	}
	
	//通知
	public void concreteNotify() {
		for(Observer observer : this.observers) {
			observer.update();
		}
	}
}
