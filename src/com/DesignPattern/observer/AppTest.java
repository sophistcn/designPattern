package com.DesignPattern.observer;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	@Test
	public void testName() throws Exception {
		Human human = new Human();
		God god = new God();
		Rulaifozu rulaifozu = new Rulaifozu();
		
		human.addObserver(rulaifozu);
		human.addObserver(god);
		human.cry();
	}
}
