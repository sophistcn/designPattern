package com.DesignPattern.factory.demo1;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��4�� ����1:45:40 
* @desc: 
* 
*/
public class ConcreteCreator1 implements Creator {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct1();
	}

}
