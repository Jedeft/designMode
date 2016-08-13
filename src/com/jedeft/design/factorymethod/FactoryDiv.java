package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: 除法工厂
 * @author Jedeft
 * @date 2016年8月13日 下午7:30:12
 */
public class FactoryDiv extends Factory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
