package com.DesignPattern.proxy;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年1月27日 上午11:22:17
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
