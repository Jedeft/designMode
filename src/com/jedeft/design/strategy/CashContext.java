package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: 策略与简单工厂结合
 * @author Jedeft
 * @date 2016年8月12日 下午1:13:19
 */
public class CashContext {
	private CashSuper cash;

	public CashContext(String cashName) {
		switch (cashName) {
			case "正常收费":
				this.cash = new CashNormal();
				break;
			case "打八折":
				this.cash = new CashRebate(0.8d);
				break;
			case "满300减100":
				this.cash = new CashReduce(300.0d, 100.0d);
				break;
		}
	}

	public Double getResult(Double money) {
		return this.cash.getResult(money);
	}
}
