package com.DesignPattern.templateMethod;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月27日 上午11:46:30 
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
