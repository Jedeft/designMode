package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: �ӷ�����
 * @author Jedeft
 * @date 2016��8��13�� ����7:26:06
 */
public class FactoryAdd extends Factory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
