package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: ��������
 * @author Jedeft
 * @date 2016��8��13�� ����7:30:12
 */
public class FactoryDiv extends Factory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
