package com.company;

public class Dog extends Actors{
	
	private static Dog dog = null;
	
	int power = 3;
	
	private Dog() {
	
	}

	public static Dog getDog() {
		if (dog == null) {
			return new Dog();
		}
		return dog;
	}
	@Override
	void call(Actors cat) {
		System.out.println("Dog is calling cat");
		currentPower += ((Cat) cat).power;
	}


}
