package com.jedeft.design.decorator;

/**
 * 
 * @Desicription: 服装类，即装饰抽象类
 * 继承了Person，从外类来扩展Person类的功能，但对于Person来说是无须知道Finery存在的
 * @author Jedeft
 * @date 2016年8月12日 下午4:51:32
 */
public class Finery extends Person{

	private Person component;
	
	public void Decorator(Person component) {
		this.component = component;
	}
	
	@Override
	public void show() {
		if (component != null) {
			component.show();
		}
	}

}
