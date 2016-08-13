package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: 减法实现类
 * @author Jedeft
 * @date 2016年8月13日 下午7:11:52
 */
public class OperationSub extends Operation {

	@Override
	public Double getResult() {
		return super.getNumberA() - super.getNumberB();
	}

}
