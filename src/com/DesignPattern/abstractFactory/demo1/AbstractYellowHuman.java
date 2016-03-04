package com.DesignPattern.abstractFactory.demo1;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午3:32:39 
* @desc: 
* 
*/
public abstract class AbstractYellowHuman implements Human {

	@Override
	public void cry() {
		System.out.println("yellow human cry");
	}

}
