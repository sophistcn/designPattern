package com.DesignPattern.abstractFactory.demo1;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��4�� ����3:36:28 
* @desc: 
* 
*/
public class MaleHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createYellowHuman() {
		System.out.println("male yellow human");
		return null;
	}

}
