package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: �����㷨
 * @author Jedeft
 * @date 2016��8��12�� ����1:07:25
 */
public class CashRebate extends CashSuper{

	private Double discountRate;
	
	public Double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}
	
	public CashRebate(Double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public Double getResult(Double money) {
		return money * discountRate;
	}

}
