package com.DesignPattern.abstractFactory.demo1;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午3:31:44 
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
