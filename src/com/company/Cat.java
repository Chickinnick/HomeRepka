package com.company;

public class Cat extends Actors{

	
	private static  Cat cat = null;

	int power = 2;
	
	private Cat() {
		
	}
	
	public static Cat getCat() {
		if (cat == null) {
			return new Cat();
			
		}
		return cat;
	}
	
	@Override
	void call(Actors mouse) {
System.out.println("Cat is calling mouse");
currentPower += ((Mouse)mouse).power;
	}

	

}
