package com.jedeft.design.factory;

/**
 * 
 * @Description: 除法类
 * @author Jedeft
 * @date 2016年8月11日 下午10:27:30
 */
public class OperationDiv extends Operation {
	@Override
	public Double getResult() throws Exception {
		if (super.getNumberB() == 0)
			throw new Exception("除数不能为0");
		return super.getNumberA()/super.getNumberB();
	}
}
