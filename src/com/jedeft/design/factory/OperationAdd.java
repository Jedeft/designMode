package com.jedeft.design.factory;

/**
 * 
 * @Description: 加法类
 * @author Jedeft
 * @date 2016年8月11日 下午10:23:43
 */
public class OperationAdd extends Operation {
	@Override
	public Double getResult() {
		return super.getNumberA() + super.getNumberB();
	}
}
