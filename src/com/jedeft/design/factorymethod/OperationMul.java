package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: �˷�ʵ����
 * @author Jedeft
 * @date 2016��8��13�� ����7:14:03
 */
public class OperationMul extends Operation {

	@Override
	public Double getResult() {
		return super.getNumberA() * super.getNumberB();
	}

}
