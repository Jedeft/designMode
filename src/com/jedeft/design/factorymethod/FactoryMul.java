package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: �˷�����
 * @author Jedeft
 * @date 2016��8��13�� ����7:28:25
 */
public class FactoryMul extends Factory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
