package com.jedeft.design.factory;

/**
 * 
 * @Description: �㷨��������
 * @author Jedeft
 * @date 2016��8��11�� ����10:13:24
 */
public class Operation {
	private Double numberA;
	private Double numberB;

	public Operation() {
		this.numberA = 0.0d;
		this.numberB = 0.0d;
	}

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

	public Double getResult() throws Exception {
		Double result = 0.0d;
		return result;
	}
}
