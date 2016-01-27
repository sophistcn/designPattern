package com.DesignPattern.proxy;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年1月27日 上午11:15:10
 * @desc:
 * 
 */
public class Girl {
	private String name;
	private String phoneNumber;
	
	public Girl(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void cry() {
		String words = "girl: " + name +" is crying now";
		System.out.println(words);
	}
}
