package com.jedeft.design.strategy;

/**
 * 
 * @Desicription: 
 * 策略模式优点：简化了单元测试，每个算法都有自己的类，可以通过自己的接口单独测试
 * 应用场景：需要在不同时间应用不同的业务规则
 * @author Jedeft
 * @date 2016年8月12日 下午1:19:30
 */
public class Main {
	public static void main(String[] args) {
		CashContext cc = new CashContext("打八折");
		
		Double result = cc.getResult(100.0d);
		
		System.out.println(result);
	}
}	
