package com.jedeft.design.decorator;

/**
 * 
 * @Desicription: ������ѡ����ҵ��
 * @author Jedeft
 * @date 2016��8��12�� ����4:36:34
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
		System.out.println("��" + name);
	}
}
