package com.DesignPattern.facade;

import com.DesignPattern.facade.badPattern.LetterProcess;
import com.DesignPattern.facade.badPattern.LetterProcessImpl;

/**
 * @author: ��־ƽ
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016��3��4�� ����5:09:02
 * @desc:
 * 
 */
public class ModernPostOfficePoliceCheck {
	private LetterProcess letterProcess = new LetterProcessImpl();
	private Police letterPolice = new Police();

	// д�ţ���װ��Ͷ�ݣ�һ�廯��
	public void sendLetter(String context, String address) {
		// ����д��
		letterProcess.writeContext(context);
		// д���ŷ�
		letterProcess.fillEnvelope(address);
		// ����Ҫ����ż���
		letterPolice.checkLetter(letterProcess);
		// ���ŷŵ��ŷ���
		letterProcess.letterInotoEnvelope();
		// �ʵ��ż�
		letterProcess.sendLetter();
	}
}
