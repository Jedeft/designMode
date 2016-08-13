package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: 加法实现类
 * @author Jedeft
 * @date 2016年8月13日 下午7:12:18
 */
public class OperationAdd extends Operation {

	@Override
	public Double getResult() {
		return super.getNumberA() + super.getNumberB();
	}

}
