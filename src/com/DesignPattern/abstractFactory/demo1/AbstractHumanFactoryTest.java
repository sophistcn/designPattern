package com.DesignPattern.abstractFactory.demo1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��4�� ����4:54:24 
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
