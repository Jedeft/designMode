package com.jedeft.design.prototype;

import java.io.IOException;


/**
 * 
 * @Description: ԭ��ģʽ
 * �˴���Ϊǳ�ȿ�¡����ȿ�¡
 * ǳ�ȿ�¡�������ƶ�������б�����������ԭ���Ķ�����ͬ��ֵ�������еĶ�������������ö���Ȼָ��ԭ���Ķ���
 * ��ȿ�¡����ȿ�¡�����ö���ı���ָ���ƹ����¶��󣬶�����ԭ�еı����õĶ���
 * @author Jedeft
 * @date 2016��8��14�� ����3:58:24
 */
public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ShallowResume shallowResume = new ShallowResume("Jedeft", 22);
		System.out.println(shallowResume);
		ShallowResume shallowClone1 = shallowResume.clone();
		System.out.println(shallowClone1);
		ShallowResume shallowClone2 = shallowResume.clone();
		System.out.println(shallowClone2);
		
		DeepWorkExperience workExperience = new DeepWorkExperience("ThoughtWorks", "5��");
		DeepResume deepResume = new DeepResume("Jedeft", 22, workExperience);
		DeepResume deepClone1 = deepResume.deepClone();
		// ��ȿ�¡����ԭ���ö������Ըı�ʱ�����ƶ������Բ��ı�
		workExperience.setWorkDate("10��");
		DeepResume deepClone2 = deepResume.deepClone();
		workExperience.setWorkDate("15��");
		System.out.println(deepResume);
		System.out.println(deepClone1);
		System.out.println(deepClone2);
	}
}