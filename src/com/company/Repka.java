package com.company;

public class Repka {
	
	int health = 21;
	
	String size; 
	String state; 
	String taste; 
		
	boolean isFree;    
	
	void restoreHealth(){
		health = 21;
	}
	
	boolean conditionOfLife()
	{
		if (this.health <= 0)
			{isFree = true;
		return false;}
		else
		restoreHealth();
		return true;
	}
}
