package com.jedeft.design.factory;

/**
 * 
 * @Description: �˷���
 * @author Jedeft
 * @date 2016��8��11�� ����10:26:06
 */
public class OperationMul extends Operation {
	@Override
	public Double getResult() {
		return super.getNumberA() * super.getNumberB();
	}
}
