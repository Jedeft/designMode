package com.jedeft.design.factory;

/**
 * 
 * @Description: 减法类
 * @author Jedeft
 * @date 2016年8月11日 下午10:24:14
 */
public class OperationSub extends Operation {
	@Override
	public Double getResult() {
		return super.getNumberA() - super.getNumberB();
	}
}
