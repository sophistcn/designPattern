package com.DesignPattern.abstractFactory.demo1;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��4�� ����3:31:44 
* @desc: 
* 
*/
public class FemaleHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createYellowHuman() {
		System.out.println("i'm yellow woman");
		return new MaleYellowHuman();
	}

}
