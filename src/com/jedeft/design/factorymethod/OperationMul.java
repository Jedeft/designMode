package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: 乘法实现类
 * @author Jedeft
 * @date 2016年8月13日 下午7:14:03
 */
public class OperationMul extends Operation {

	@Override
	public Double getResult() {
		return super.getNumberA() * super.getNumberB();
	}

}
