package com.jedeft.design.observer;

/**
 * 
 * @Description: ֪ͨ�߾���ʵ����
 * @author Jedeft
 * @date 2016��8��12�� ����10:31:52
 */
public class ConcreteSubject extends Subject {
	// ֪ͨ״̬
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

}
