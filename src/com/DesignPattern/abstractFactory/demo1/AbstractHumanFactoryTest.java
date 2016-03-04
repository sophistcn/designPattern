package com.DesignPattern.abstractFactory.demo1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午4:54:24 
* @desc: 
* 
*/
public class AbstractHumanFactoryTest {
	@Test
	public void testcreateHuman() throws Exception {
		HumanFactoryInterface maleHumanFactory = new MaleHumanFactory();
		
		Human human = maleHumanFactory.createYellowHuman();
		human.cry();
		
	}
}
