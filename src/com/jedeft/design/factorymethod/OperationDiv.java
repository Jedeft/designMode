package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: 除法实现类
 * @author Jedeft
 * @date 2016年8月13日 下午7:18:39
 */
public class OperationDiv extends Operation{

	@Override
	public Double getResult() throws Exception{
		if (super.getNumberB() == null || super.getNumberB() == 0)
			throw new Exception("除数不能为0");
		return super.getNumberA()/super.getNumberB();
	}

}
