package com.DesignPattern.factory.demo1;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��4�� ����1:48:23 
* @desc: 
* 
*/
public class ConcreteCreator2 implements Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct2();
	}

}
