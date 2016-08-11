package com.jedeft.design.factory;

/**
 * 
 * @Description: 程序入口
 * @author Jedeft
 * @date 2016年8月11日 下午10:32:54
 */
public class Main {
	public static void main(String[] args) {
		Operation oper = OperationFactory.createOperate("+");
		oper.setNumberA(10.0d);
		oper.setNumberB(12.0d);
		try {
			System.out.println(oper.getResult());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
