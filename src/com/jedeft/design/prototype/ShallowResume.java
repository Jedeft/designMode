package com.jedeft.design.prototype;

/**
 * 
 * @Description: 个人简历（浅克隆） 浅克隆只会对基本类型进行传值复制，对于引用对象则只是复制了引用，而并没有创建新的对象
 * Java中clone()是Object的方法，但是不能使用Object调用clone方法
 * clone() 对Object类本身是不可见的。所以找不到clone方法
 * clone() 方法是protected权限，只对同一包中的类和不同包中的子类和间接子类可访问，换句话说就是不同包中的非子类或间接子类不能访问，包含了默认的包访问权限
 * 这里包含了父类本身，调用者是父类，在不同包中，protected成员对父类不可见，根本无法用Object对象调用clone()
 * 因为在不同包中父类本身不能调用，也找不到protected方法，故无法在代码中使用object直接调用clone()方法
 * J2SE API文档中说明：要让实例调用clone() 方法就要让此类实现Cloneable接口
 * 				         如果在没有实现Cloneable接口的实例上调用Object的clone() 方法，则会抛出CloneNotSupportedException异常
 * 				   Cloneable和Serializable一样，只是一个标签接口，不含任何需要实现的方法
 * @author Jedeft
 * @date 2016年8月14日 下午4:26:56
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
