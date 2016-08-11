package com.jedeft.design.factory;

/**
 * 
 * @Description: 简单工厂
 * @author Jedeft
 * @date 2016年8月11日 下午10:33:47
 */
public class OperationFactory {
	public static Operation createOperate(String operate) {
		Operation oper = null;
		switch (operate) {
			case "+":
				oper = new OperationAdd();
				break;
			case "-":
				oper = new OperationSub();
				break;
			case "*":
				oper = new OperationMul();
				break;
			case "/":
				oper = new OperationDiv();
				break;
			default:
				break;
		}
		return oper;
	}
}
