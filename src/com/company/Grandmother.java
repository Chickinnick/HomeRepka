package com.company;

public class Grandmother extends Actors {

	private static Grandmother grandmother = null;
	
	int power = 5;
	
	private Grandmother() {
		// TODO Auto-generated constructor stub
	}
	
	public static Grandmother getGrandmother() {
		if (grandmother == null) {
			return new Grandmother();
		}
		
		return grandmother;
	}
	
	
	@Override
	void call(Actors girl) {
		System.out.println("Granny is calling the Girl");
		currentPower +=((Girl) girl).power;
	}

}
