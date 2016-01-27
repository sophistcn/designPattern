package com.DesignPattern.proxy;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��1��27�� ����11:18:41 
* @desc: 
* 
*/
public class Proxy implements Subject {
	private Subject realSubject;
	
	public Proxy(Subject realSubject) {
		super();
		this.realSubject = realSubject;
	}
	
	public Proxy() {
		this.realSubject = new RealSubject();
	}

	@Override
	public String haveSex(Girl girl) {
		return getRealSubject().haveSex(girl);
	}

	public Subject getRealSubject() {
		System.out.println("I'm asking real subject to do that.");
		return realSubject;
	}

	public void setRealSubject(Subject realSubject) {
		this.realSubject = realSubject;
	}

}
