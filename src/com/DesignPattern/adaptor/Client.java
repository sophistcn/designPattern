package com.DesignPattern.adaptor;

/**
 * @author: ��־ƽ
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016��1��27�� ����11:51:31
 * @desc:
 * 
 */
public class Client {
	public static void main(String[] args) {
		// ʹ����ͨ������
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();

		// ʹ�����⹦���࣬��������
		Target adapter = new Adapter();
		adapter.request();
	}
}
