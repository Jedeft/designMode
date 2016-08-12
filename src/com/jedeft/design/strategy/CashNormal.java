package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: 原价
 * @author Jedeft
 * @date 2016年8月12日 下午1:02:17
 */
public class CashNormal extends CashSuper {

	@Override
	public Double getResult(Double money) {
		return money;
	}

}
