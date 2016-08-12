package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: 满减算法
 * @author Jedeft
 * @date 2016年8月12日 下午1:09:43
 */
public class CashReduce extends CashSuper {

	// 满减条件
	private Double threshold;
	// 满减金额
	private Double reduceMoney;

	public Double getThreshold() {
		return threshold;
	}

	public void setThreshold(Double threshold) {
		this.threshold = threshold;
	}

	public Double getReduceMoney() {
		return reduceMoney;
	}

	public void setReduceMoney(Double reduceMoney) {
		this.reduceMoney = reduceMoney;
	}

	public CashReduce(Double threshold, Double reduceMoney) {
		super();
		this.threshold = threshold;
		this.reduceMoney = reduceMoney;
	}

	@Override
	public Double getResult(Double money) {
		Integer multiple = (int) (money / threshold);
		return multiple * reduceMoney;
	}

}
