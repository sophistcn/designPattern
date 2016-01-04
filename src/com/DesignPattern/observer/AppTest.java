package com.DesignPattern.observer;

public class AppTest {
	public static void main(String[] args) {
		Human human = new Human();
		God god = new God();
		
		human.addObserver(god);
		human.cry();
	}
}
