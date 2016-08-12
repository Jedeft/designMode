package com.jedeft.design.proxy;

/**
 * 
 * @Description: 静态代理
 * 类似于Spring的AOP面向切面编程
 * 应用场景：比如日志发送，发送日志前或者发送日之后的额外操作，可通过静态代理实现
 * @author Jedeft
 * @date 2016年8月12日 下午9:29:00
 */
public class Main {
	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.request();
	}
}
