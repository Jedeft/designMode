package com.jedeft.design.factory;

/**
 * 
 * @Description: 乘法类
 * @author Jedeft
 * @date 2016年8月11日 下午10:26:06
 */
public class OperationMul extends Operation {
	@Override
	public Double getResult() {
		return super.getNumberA() * super.getNumberB();
	}
}
