package com.jedeft.design.prototype;

import java.io.Serializable;

/**
 * 
 * @Description: ���������࣬ʵ��Serializable�ӿ���Ҫ��Ϊ����ȿ�¡��
 * ��ȿ�¡��������ǰ����Ƕ��󼰶����ڲ������õ��Ķ��󶼱����ǿɴ��л�(���л�)��
 * @author Jedeft
 * @date 2016��8��14�� ����4:52:37
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
