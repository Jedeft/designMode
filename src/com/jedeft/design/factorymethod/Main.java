package com.jedeft.design.factorymethod;

/**
 * 
 * @Description: ��������ģʽ ����һ�����ڴ�������Ľӿڣ����������ʵ������һ���ࡣ��������ʹһ�����ʵ�����ӳٵ�����
 *               ��������ģʽ���ڼ򵥹���ģʽ�ĵط����ڣ���ѭ�˷��-����ԭ��
 *               �ڿͻ������жϣ����Ʒ��������򵥹���������Operation�ж���Facotry�����ڵķ�װת�Ƶ��˿ͻ��˵ķ�װ
 *               �ƺ����㣬�����ڹ�������ģʽ�¶�����չ�µķ����������޸�Factory�еĴ��룬ֻ������µ��༴��
 *               ������֤�˼��д���İ�ȫ�ԣ�
 * @author Jedeft
 * @date 2016��8��13�� ����7:05:28
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
