package com.jedeft.design.factory;

/**
 * 
 * @Description: ������
 * @author Jedeft
 * @date 2016��8��11�� ����10:24:14
 */
public class OperationSub extends Operation {
	@Override
	public Double getResult() {
		return super.getNumberA() - super.getNumberB();
	}
}
