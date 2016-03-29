package com.DesignPattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
* @author: 吴志平
* @mailTo: sophistwu@outlook.com
* @createDate: 2016年3月26日 下午3:28:40 
* @desc: 
* 
*/
public class Rulaifozu implements Observer {

	public void update(Observable o, Object arg) {
		System.out.println("ru lai fo zu see " + arg.toString());
	}

}
