package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: 加法工厂
 * @author Jedeft
 * @date 2016年8月13日 下午7:26:06
 */
public class FactoryAdd extends Factory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
