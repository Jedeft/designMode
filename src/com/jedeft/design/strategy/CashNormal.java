package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: ԭ��
 * @author Jedeft
 * @date 2016��8��12�� ����1:02:17
 */
public class CashNormal extends CashSuper {

	@Override
	public Double getResult(Double money) {
		return money;
	}

}
