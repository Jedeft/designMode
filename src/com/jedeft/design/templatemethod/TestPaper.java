package com.jedeft.design.templatemethod;

/**
 * 
 * @Description: 抽象模板类
 * @author Jedeft
 * @date 2016年8月14日 下午5:56:36
 */
public abstract class TestPaper {
	public void question1() {
		System.out.println("题目1： **************");
		System.out.println("答案：" + answer1());
	}
	
	public void question2() {
		System.out.println("题目2： **************");
		System.out.println("答案：" + answer2());
	}
	
	public void question3() {
		System.out.println("题目3： **************");
		System.out.println("答案：" + answer3());
	}
	
	public abstract String answer1();
	
	public abstract String answer2();
	
	public abstract String answer3();
}
