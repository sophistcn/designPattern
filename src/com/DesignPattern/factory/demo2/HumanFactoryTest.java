package com.DesignPattern.factory.demo2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午3:20:35 
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
