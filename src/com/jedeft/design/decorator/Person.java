package com.jedeft.design.decorator;

/**
 * 
 * @Desicription: 人自由选择穿衣业务
 * @author Jedeft
 * @date 2016年8月12日 下午4:36:34
 */
public class Person {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person() {
		super();
	}

	public void show(){
		System.out.println("的" + name);
	}
}
