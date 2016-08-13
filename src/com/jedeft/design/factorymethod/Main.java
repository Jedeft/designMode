package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: 工厂方法模式 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到子类
 *               工厂方法模式优于简单工厂模式的地方在于，遵循了封闭-开放原则
 *               在客户端做判断，看似繁琐，将简单工厂的生成Operation判断由Facotry方法内的封装转移到了客户端的封装
 *               似乎不便，但是在工厂方法模式下对于扩展新的方法，不用修改Factory中的代码，只用添加新的类即可
 *               这样保证了既有代码的安全性，
 * @author Jedeft
 * @date 2016年8月13日 下午7:05:28
 */
public class Main {
	public static void main(String[] args) {
		Factory factory = new FactoryAdd();
		Operation operation = factory.createOperation();

		operation.setNumberA(10.0d);
		operation.setNumberB(20.0d);

		try {
			System.out.println(operation.getResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
