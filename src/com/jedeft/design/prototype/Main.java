package com.jedeft.design.prototype;

import java.io.IOException;


/**
 * 
 * @Description: 原型模式
 * 此处分为浅度克隆和深度克隆
 * 浅度克隆：被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用都仍然指向原来的对象
 * 深度克隆：深度克隆把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象
 * @author Jedeft
 * @date 2016年8月14日 下午3:58:24
 */
public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ShallowResume shallowResume = new ShallowResume("Jedeft", 22);
		System.out.println(shallowResume);
		ShallowResume shallowClone1 = shallowResume.clone();
		System.out.println(shallowClone1);
		ShallowResume shallowClone2 = shallowResume.clone();
		System.out.println(shallowClone2);
		
		DeepWorkExperience workExperience = new DeepWorkExperience("ThoughtWorks", "5年");
		DeepResume deepResume = new DeepResume("Jedeft", 22, workExperience);
		DeepResume deepClone1 = deepResume.deepClone();
		// 深度克隆，当原引用对象属性改变时，复制对象属性不改变
		workExperience.setWorkDate("10年");
		DeepResume deepClone2 = deepResume.deepClone();
		workExperience.setWorkDate("15年");
		System.out.println(deepResume);
		System.out.println(deepClone1);
		System.out.println(deepClone2);
	}
}