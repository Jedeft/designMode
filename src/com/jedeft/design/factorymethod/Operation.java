package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: 算法符号祖类
 * @author Jedeft
 * @date 2016年8月13日 下午7:08:13
 */
public abstract class Operation {
	private Double numberA;
	private Double numberB;

	public Double getNumberA() {
		return numberA;
	}

	public void setNumberA(Double numberA) {
		this.numberA = numberA;
	}

	public Double getNumberB() {
		return numberB;
	}

	public void setNumberB(Double numberB) {
		this.numberB = numberB;
	}

	public abstract Double getResult() throws Exception;
}
