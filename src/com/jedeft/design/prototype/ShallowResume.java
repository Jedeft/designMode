package com.jedeft.design.prototype;

/**
 * 
 * @Description: ���˼�����ǳ��¡�� ǳ��¡ֻ��Ի������ͽ��д�ֵ���ƣ��������ö�����ֻ�Ǹ��������ã�����û�д����µĶ���
 * Java��clone()��Object�ķ��������ǲ���ʹ��Object����clone����
 * clone() ��Object�౾���ǲ��ɼ��ġ������Ҳ���clone����
 * clone() ������protectedȨ�ޣ�ֻ��ͬһ���е���Ͳ�ͬ���е�����ͼ������ɷ��ʣ����仰˵���ǲ�ͬ���еķ�����������಻�ܷ��ʣ�������Ĭ�ϵİ�����Ȩ��
 * ��������˸��౾���������Ǹ��࣬�ڲ�ͬ���У�protected��Ա�Ը��಻�ɼ��������޷���Object�������clone()
 * ��Ϊ�ڲ�ͬ���и��౾���ܵ��ã�Ҳ�Ҳ���protected���������޷��ڴ�����ʹ��objectֱ�ӵ���clone()����
 * J2SE API�ĵ���˵����Ҫ��ʵ������clone() ������Ҫ�ô���ʵ��Cloneable�ӿ�
 * 				         �����û��ʵ��Cloneable�ӿڵ�ʵ���ϵ���Object��clone() ����������׳�CloneNotSupportedException�쳣
 * 				   Cloneable��Serializableһ����ֻ��һ����ǩ�ӿڣ������κ���Ҫʵ�ֵķ���
 * @author Jedeft
 * @date 2016��8��14�� ����4:26:56
 */
public class ShallowResume implements Cloneable {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public ShallowResume() {
		super();
	}

	public ShallowResume(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "ShallowResume [name=" + name + ", age=" + age + "]";
	}

	public ShallowResume clone() {
		ShallowResume resume = null;
		try {
			resume = (ShallowResume) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return resume;
	}
}
