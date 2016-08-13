package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: ����ʵ����
 * @author Jedeft
 * @date 2016��8��13�� ����7:18:39
 */
public class OperationDiv extends Operation{

	@Override
	public Double getResult() throws Exception{
		if (super.getNumberB() == null || super.getNumberB() == 0)
			throw new Exception("��������Ϊ0");
		return super.getNumberA()/super.getNumberB();
	}

}
