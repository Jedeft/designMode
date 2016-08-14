package com.jedeft.design.templatemethod;

/**
 * 
 * @Description: ����ģ����
 * @author Jedeft
 * @date 2016��8��14�� ����5:56:36
 */
public abstract class TestPaper {
	public void question1() {
		System.out.println("��Ŀ1�� **************");
		System.out.println("�𰸣�" + answer1());
	}
	
	public void question2() {
		System.out.println("��Ŀ2�� **************");
		System.out.println("�𰸣�" + answer2());
	}
	
	public void question3() {
		System.out.println("��Ŀ3�� **************");
		System.out.println("�𰸣�" + answer3());
	}
	
	public abstract String answer1();
	
	public abstract String answer2();
	
	public abstract String answer3();
}
