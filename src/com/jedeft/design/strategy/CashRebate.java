package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: 打折算法
 * @author Jedeft
 * @date 2016年8月12日 下午1:07:25
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
