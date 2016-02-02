package com.DesignPattern.templateMethod;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��1��27�� ����11:46:30 
* @desc: 
* 
*/
public abstract class Template {
	protected abstract void step1();
	protected abstract void step2();
	
	public void run(){
		step1();
		step2();
	}
}
