package com.DesignPattern.proxy;

/**
 * @author: ��־ƽ
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016��1��27�� ����11:15:10
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
