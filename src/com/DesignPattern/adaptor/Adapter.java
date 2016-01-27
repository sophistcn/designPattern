package com.DesignPattern.adaptor;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年1月27日 上午11:51:07 
* @desc: 
* 
*/
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.specificRequest();
	}

}
