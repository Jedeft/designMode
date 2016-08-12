package com.jedeft.design.decorator;

/**
 * 
 * @Desicription: 具体服装类，继承Finery，扩展功能
 * @author Jedeft
 * @date 2016年8月12日 下午4:55:05
 */
public class TShirt extends Finery {

	@Override
	public void show() {
		System.out.println("T恤");
		super.show();
	}
	
}
