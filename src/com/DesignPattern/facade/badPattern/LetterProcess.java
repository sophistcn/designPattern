package com.DesignPattern.facade.badPattern;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月4日 下午5:00:36 
* @desc: 
* 
*/
public interface LetterProcess {
	//首先要写信的内容
	public void writeContext(String context);
	//其次写信封
	public void fillEnvelope(String address);
	//把信放到信封里
	public void letterInotoEnvelope();
	//然后邮递
	public void sendLetter();
}
