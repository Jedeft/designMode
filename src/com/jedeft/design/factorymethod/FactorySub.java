package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: ��������
 * @author Jedeft
 * @date 2016��8��13�� ����7:27:40
 */
public class FactorySub extends Factory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
