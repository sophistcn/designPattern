package com.DesignPattern.facade.badPattern;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��4�� ����5:02:05 
* @desc: 
* 
*/
public class LetterProcessImpl implements LetterProcess {
	//д��
	public void writeContext(String context) {
	System.out.println("��д�ŵ�����...." + context);
	}
	//���ŷ�����д��Ҫ����Ϣ
	public void fillEnvelope(String address) {
	System.out.println("��д�ռ��˵�ַ������...." + address);
	}
	//���ŷŵ��ŷ��У������
	public void letterInotoEnvelope() {
	System.out.println("���ŷŵ��ŷ���....");
	}
	//���������У��ʵ�
	public void sendLetter() {
	System.out.println("�ʵ��ż�...");
	}

}
