package com.DesignPattern.proxy;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年1月27日 上午11:14:35
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
