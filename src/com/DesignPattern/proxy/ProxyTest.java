package com.DesignPattern.proxy;

/**
 * @author: ��־ƽ
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016��1��27�� ����11:22:17
 * @desc:
 * 
 */
public class ProxyTest {
	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		Subject realSubject = new RealSubject();
		proxy.setRealSubject(realSubject);
		proxy.haveSex(new Girl("lucy", "13688998877"));
	}
}
