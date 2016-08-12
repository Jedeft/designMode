package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: �����㷨
 * @author Jedeft
 * @date 2016��8��12�� ����1:09:43
 */
public class CashReduce extends CashSuper {

	// ��������
	private Double threshold;
	// �������
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
