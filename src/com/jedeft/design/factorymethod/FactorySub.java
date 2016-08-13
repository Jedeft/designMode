package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: 减法工厂
 * @author Jedeft
 * @date 2016年8月13日 下午7:27:40
 */
public class FactorySub extends Factory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
