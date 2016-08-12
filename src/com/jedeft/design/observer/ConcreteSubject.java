package com.jedeft.design.observer;

/**
 * 
 * @Description: 通知者具体实现类
 * @author Jedeft
 * @date 2016年8月12日 下午10:31:52
 */
public class ConcreteSubject extends Subject {
	// 通知状态
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

}
