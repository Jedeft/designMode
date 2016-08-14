package com.jedeft.design.prototype;

import java.io.Serializable;

/**
 * 
 * @Description: 工作经历类，实现Serializable接口主要是为了深度克隆，
 * 深度克隆处理方法的前提就是对象及对象内部的引用到的对象都必须是可串行化(序列化)的
 * @author Jedeft
 * @date 2016年8月14日 下午4:52:37
 */
public class DeepWorkExperience implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 214479756493147886L;
	
	private String company;
	private String workDate;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public DeepWorkExperience(String company, String workDate) {
		this.company = company;
		this.workDate = workDate;
	}

	public DeepWorkExperience() {
		super();
	}

	@Override
	public String toString() {
		return "DeepWorkExperience [company=" + company + ", workDate="
				+ workDate + "]";
	}
}
