package com.DesignPattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
* @author: ��־ƽ
* @mailTo: sophistwu@outlook.com
* @createDate: 2016��3��26�� ����3:28:40 
* @desc: 
* 
*/
public class Rulaifozu implements Observer {

	public void update(Observable o, Object arg) {
		System.out.println("ru lai fo zu see " + arg.toString());
	}

}
