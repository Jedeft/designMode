package com.jedeft.design.templatemethod;

/**
 * 
 * @Description: ģ�巽��ģʽ
 * ����һ�������е��㷨�ĹǼܣ�����һЩ�����ӳٵ������С�ģ�巽��ʹ��������Բ��ı�һ���㷨�Ľṹ�������¶�����㷨��ĳЩ�ض�����
 * @author Jedeft
 * @date 2016��8��14�� ����5:49:50
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
