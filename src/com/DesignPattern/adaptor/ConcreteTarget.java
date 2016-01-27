package com.DesignPattern.adaptor;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月27日 上午11:49:30 
* @desc: 
* 
*/
public class ConcreteTarget implements Target {

	@Override
	public void request() {
		System.out.println("普通类，只具有普通功能。。。");
	}

}
