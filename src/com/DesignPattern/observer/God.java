package com.DesignPattern.observer;

import java.util.Observable;
import java.util.Observer;

public class God implements Observer {

	public void update(Observable observable, Object obj) {
		System.out.println("god see : " + obj.toString());
	}

}
