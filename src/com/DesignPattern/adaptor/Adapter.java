package com.DesignPattern.adaptor;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��1��27�� ����11:51:07 
* @desc: 
* 
*/
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.specificRequest();
	}

}
