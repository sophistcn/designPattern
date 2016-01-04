package com.DesignPattern.observer;

import java.util.Observable;

public class Human extends Observable {
	public void cry(){
		System.out.println("i'm crying");
		super.setChanged();
		super.notifyObservers("human is cyring");
	}
}
