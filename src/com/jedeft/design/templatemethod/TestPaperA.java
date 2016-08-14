package com.jedeft.design.templatemethod;

/**
 * 
 * @Description: 模板实现类
 * @author Jedeft
 * @date 2016年8月14日 下午5:57:53
 */
public class TestPaperA extends TestPaper {
	
	@Override
	public String answer1() {
		return "A";
	}

	@Override
	public String answer2() {
		return "B";
	}

	@Override
	public String answer3() {
		return "C";
	}

}
