package com.DesignPattern.facade.badPattern;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午5:03:08 
* @desc: 
* 
*/
public class LetterProcessTest extends TestCase{
	@Test
	public void testwriteLetter() throws Exception {
		//创建一个处理信件的过程
		LetterProcess letterProcess = new LetterProcessImpl();
		//开始写信
		letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your	old lover. I'd like to....");
		//开始写信封
		letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
		//把信放到信封里，并封装好
		letterProcess.letterInotoEnvelope();
		//跑到邮局把信塞到邮箱，投递
		letterProcess.sendLetter();
	}
}
