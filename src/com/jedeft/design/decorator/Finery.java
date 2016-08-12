package com.jedeft.design.decorator;

/**
 * 
 * @Desicription: ��װ�࣬��װ�γ�����
 * �̳���Person������������չPerson��Ĺ��ܣ�������Person��˵������֪��Finery���ڵ�
 * @author Jedeft
 * @date 2016��8��12�� ����4:51:32
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
