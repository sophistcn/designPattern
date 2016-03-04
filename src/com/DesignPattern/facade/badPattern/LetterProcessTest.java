package com.DesignPattern.facade.badPattern;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��4�� ����5:03:08 
* @desc: 
* 
*/
public class LetterProcessTest extends TestCase{
	@Test
	public void testwriteLetter() throws Exception {
		//����һ�������ż��Ĺ���
		LetterProcess letterProcess = new LetterProcessImpl();
		//��ʼд��
		letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your	old lover. I'd like to....");
		//��ʼд�ŷ�
		letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
		//���ŷŵ��ŷ������װ��
		letterProcess.letterInotoEnvelope();
		//�ܵ��ʾְ����������䣬Ͷ��
		letterProcess.sendLetter();
	}
}
