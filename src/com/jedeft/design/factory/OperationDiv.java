package com.jedeft.design.factory;

/**
 * 
 * @Description: ������
 * @author Jedeft
 * @date 2016��8��11�� ����10:27:30
 */
public class OperationDiv extends Operation {
	@Override
	public Double getResult() throws Exception {
		if (super.getNumberB() == 0)
			throw new Exception("��������Ϊ0");
		return super.getNumberA()/super.getNumberB();
	}
}
