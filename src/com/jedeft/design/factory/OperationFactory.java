package com.jedeft.design.factory;

/**
 * 
 * @Description: �򵥹���
 * @author Jedeft
 * @date 2016��8��11�� ����10:33:47
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
