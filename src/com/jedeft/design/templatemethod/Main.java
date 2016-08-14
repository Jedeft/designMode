package com.jedeft.design.templatemethod;

/**
 * 
 * @Description: 模板方法模式
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤
 * @author Jedeft
 * @date 2016年8月14日 下午5:49:50
 */
public class Main {
	public static void main(String[] args) {
		TestPaper testPaperA = new TestPaperA();
		
		TestPaper testPaperB = new TestPaperB();
		
		testPaperA.question1();
		testPaperA.question2();
		testPaperA.question3();
		
		System.out.println("================================");
		
		testPaperB.question1();
		testPaperB.question2();
		testPaperB.question3();
	}
}
