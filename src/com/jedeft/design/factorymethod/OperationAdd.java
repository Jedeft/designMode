package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: �ӷ�ʵ����
 * @author Jedeft
 * @date 2016��8��13�� ����7:12:18
 */
public class OperationAdd extends Operation {

	@Override
	public Double getResult() {
		return super.getNumberA() + super.getNumberB();
	}

}
