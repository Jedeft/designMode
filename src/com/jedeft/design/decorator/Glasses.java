package com.jedeft.design.decorator;

/**
 * 
 * @Desicription: 具体服装类，继承Finery，扩展功能
 * @author Jedeft
 * @date 2016年8月12日 下午5:03:38
 */
public class Glasses extends Finery {
	@Override
	public void show(){
		System.out.println("眼镜");
		super.show();
	}
}
