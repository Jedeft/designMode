package com.jedeft.design.factory;

/**
 * 
 * @Description: �ӷ���
 * @author Jedeft
 * @date 2016��8��11�� ����10:23:43
 */
public class OperationAdd extends Operation {
	@Override
	public Double getResult() {
		return super.getNumberA() + super.getNumberB();
	}
}
