package com.DesignPattern.facade.badPattern;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��4�� ����5:00:36 
* @desc: 
* 
*/
public interface LetterProcess {
	//����Ҫд�ŵ�����
	public void writeContext(String context);
	//���д�ŷ�
	public void fillEnvelope(String address);
	//���ŷŵ��ŷ���
	public void letterInotoEnvelope();
	//Ȼ���ʵ�
	public void sendLetter();
}
