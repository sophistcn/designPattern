package com.DesignPattern.facade;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��4�� ����5:07:52 
* @desc: 
* 
*/
public class Client extends TestCase {
	@Test
	public void testName() throws Exception {
		//�ִ������ʾ֣�����������ʾ����ƽ�Hell Road
		ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
		//��ֻҪ���ŵ����ݺ������˵�ַ����������������һϵ�еĹ�����
		String address = "Happy Road No. 666,God Province,Heaven"; //����һ����ַ
		String context = "Hello,It's me,do you know who I am? I'm your old lover.		I'd like to....";
		hellRoadPostOffice.sendLetter(context, address);
	}
}
