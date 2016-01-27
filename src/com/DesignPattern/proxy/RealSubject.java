package com.DesignPattern.proxy;

/**
 * @author: ��־ƽ
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016��1��27�� ����11:14:35
 * @desc:
 * 
 */
public class RealSubject implements Subject {
	private String name;

	public RealSubject(String name) {
		super();
		this.name = name;
	}

	public RealSubject() {
		this.name = "sophist wu";
	}

	@Override
	public String haveSex(Girl girl) {
		System.out.println(name + " having sex with girl " + girl.getName());
		girl.cry();
		return name + " having sex with girl " + girl.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
