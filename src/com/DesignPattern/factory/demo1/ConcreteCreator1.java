package com.DesignPattern.factory.demo1;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午1:45:40 
* @desc: 
* 
*/
public class ConcreteCreator1 implements Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct1();
	}

}
