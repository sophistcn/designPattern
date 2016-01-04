package com.DesignPattern.composite;

import java.util.ArrayList;

public interface IBranch {
	public void addSubordinate (Icorp corp);
	
	public ArrayList<Icorp> getSubordinate();
	
}
