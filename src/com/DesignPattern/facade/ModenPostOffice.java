package com.DesignPattern.facade;

import com.DesignPattern.facade.badPattern.LetterProcess;
import com.DesignPattern.facade.badPattern.LetterProcessImpl;

/**
 * @author: 吴志平
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年3月4日 下午5:05:09
 * @desc:
 * 
 */
public class ModenPostOffice {
	private LetterProcess letterProcess = new LetterProcessImpl();

	// 写信，封装，投递，一体化了
	public void sendLetter(String context, String address) {
		// 帮你写信
		letterProcess.writeContext(context);
		// 写好信封
		letterProcess.fillEnvelope(address);
		// 把信放到信封中
		letterProcess.letterInotoEnvelope();
		// 邮递信件
		letterProcess.sendLetter();
	}
}