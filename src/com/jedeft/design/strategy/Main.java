package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: 
 * ����ģʽ�ŵ㣺���˵�Ԫ���ԣ�ÿ���㷨�����Լ����࣬����ͨ���Լ��Ľӿڵ�������
 * Ӧ�ó�������Ҫ�ڲ�ͬʱ��Ӧ�ò�ͬ��ҵ�����
 * @author Jedeft
 * @date 2016��8��12�� ����1:19:30
 */
public class Main {
	public static void main(String[] args) {
		CashContext cc = new CashContext("�����");
		
		Double result = cc.getResult(100.0d);
		
		System.out.println(result);
	}
}	
