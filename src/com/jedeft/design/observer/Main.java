package com.jedeft.design.observer;

/**
 * 
 * @Description: 观察者模式又叫发布-订阅模式
 * 该版本的观察者模式并未完全解耦，发布者依赖于观察者的抽象类（抽象接口）
 * 完全解耦的观察者模式为观察者模式+代理模式，通过代理模式实现.net中的委托效果
 * @author Jedeft
 * @date 2016年8月12日 下午10:21:17
 */
public class Main {
	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		concreteSubject.attach(new ConcreteObserver("小周", concreteSubject));
		concreteSubject.attach(new ConcreteObserver("小王", concreteSubject));
		concreteSubject.attach(new ConcreteObserver("小李", concreteSubject));
		
		concreteSubject.setSubjectState("ABC");
		
		concreteSubject.concreteNotify();
	}
}
