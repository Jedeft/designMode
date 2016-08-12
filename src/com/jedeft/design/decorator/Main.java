package com.jedeft.design.decorator;

/**
 * 
 * @Desicription: װ��ģʽ��Ϊ���й��ܶ�̬����Ӹ��๦�ܵ�һ�ַ�ʽ
 * Ӧ�ó�������ϵͳ��Ҫ�¹���ʱ���������������µĴ��롣��Щ�¼ӵĴ���ͨ��װ����ԭ����ĺ���ְ�����Ҫ��Ϊ
 * ��������������Ҫ�������ڣ��������м������µ��ֶΣ��µķ������µ��߼����Ӷ�����������ĸ��Ӷ�
 * ���¼���Ķ���ֻ��Ϊ���������ض�����²Ż�ִ�е�������Ҫ����ʱװ��ģʽ�ṩ�˺ܺõĽ��������
 * ��ÿ��Ҫװ�ε�����ڵ��������У�����������װ����Ҫװ�εĶ�����ˣ���ִ��������Ϊʱ���ͻ�����Ϳ���������ʱ������Ҫ
 * ��ѡ��أ���˳���ʹ��װ�ι��ܰ�װ�����ˡ�
 * @author Jedeft
 * @date 2016��8��12�� ����5:04:54
 */
public class Main {
	public static void main(String[] args) {
		Person person = new Person("Jedeft");
		
		//����Person��˵������֪��Finery���ڵ�
//		Finery finery = new Finery();
		Shoes shoes = new Shoes();
		TShirt tshirt = new TShirt();
		Glasses glasses = new Glasses();
		
		//�˴������±ƣ��ٴ˴������¾������
		//1. ͨ��Decorator��������shoes,tshirt��Щ��������ת��ΪPerson�����װ��Finery����
		//2. ��ִ��glasses.show()ʱ����װ�඼ͨ������ת�ͷ�װ��Finery�����ˣ���һ��������۾���glasses.show()�Ľ��
		//3. ��glasses.show()ִ��������е�super.show()�����ø����Finery��show������glasses�ĸ���Finery�з�װ��person����show����ʱ����ת��Ϊtshirt����
		//4. tshirt.show()ִ��������е�super.show()�����ø����Finery��show������glasses����Finery�з�װ��person����show����ʱ����ת��Ϊshoes����
		//5. shoes.show()ִ������������ƣ������Finery�з�װ���Ǹ���Person����show����
		shoes.Decorator(person);
		tshirt.Decorator(shoes);
		glasses.Decorator(tshirt);

		glasses.show();
		
		//��������
		//�۾�
		//T��
		//Ь��
		//��Jedeft
	}
}
