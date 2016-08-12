package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: ������򵥹������
 * @author Jedeft
 * @date 2016��8��12�� ����1:13:19
 */
public class CashContext {
	private CashSuper cash;

	public CashContext(String cashName) {
		switch (cashName) {
			case "�����շ�":
				this.cash = new CashNormal();
				break;
			case "�����":
				this.cash = new CashRebate(0.8d);
				break;
			case "��300��100":
				this.cash = new CashReduce(300.0d, 100.0d);
				break;
		}
	}

	public Double getResult(Double money) {
		return this.cash.getResult(money);
	}
}
