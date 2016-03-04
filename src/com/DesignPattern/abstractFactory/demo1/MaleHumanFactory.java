package com.DesignPattern.abstractFactory.demo1;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午3:36:28 
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
