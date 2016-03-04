package com.DesignPattern.factory.demo2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��4�� ����3:20:35 
* @desc: 
* 
*/
public class HumanFactoryTest extends TestCase {
	@Test
	public void testcreateHuman() throws Exception {
		Human human = HumanFactory.createHuman(WhiteHuman.class);
		human.cry();
	}
}
