package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: 乘法工厂
 * @author Jedeft
 * @date 2016年8月13日 下午7:28:25
 */
public class FactoryMul extends Factory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
