package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: 简单策略模式->应对不同时间应用不同的规则的情景
 * @author Jedeft
 * @date 2016年8月12日 下午12:59:20
 */
public abstract class CashSuper {
	/**
	 * 算法抽象方法（得到最后优惠价）
	 * @return
	 */
	public abstract Double getResult(Double money);
}
