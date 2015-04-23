package com.company;

public class Girl extends Actors{
	
	private static Girl girl = null;
	
	int power = 4;
	
	private Girl() {
	
	}
	
	public static Girl getGirl() {
		if (girl == null) {
			return new Girl();
		}
		return girl;
	}

	@Override
	void call(Actors dog) {
		System.out.println("Girl is calling dog...");
		currentPower += ((Dog)dog).power;
	}


}
