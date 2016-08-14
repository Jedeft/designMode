package com.jedeft.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * @Description: TODO
 * @author Jedeft
 * @date 2016年8月14日 下午4:55:28
 */
public class DeepResume implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1713589995358281600L;

	private String name;
	private Integer age;
	private DeepWorkExperience workExperience;

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

	public DeepWorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(DeepWorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	@Override
	public String toString() {
		return "DeepResume [name=" + name + ", age=" + age
				+ ", workExperience=" + workExperience + "]";
	}

	public DeepResume(String name, Integer age,
			DeepWorkExperience workExperience) {
		this.name = name;
		this.age = age;
		this.workExperience = workExperience;
	}

	public DeepResume() {
		super();
	}

	public DeepResume deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);// 从流里读出来
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return (DeepResume) (oi.readObject());
	}
}
