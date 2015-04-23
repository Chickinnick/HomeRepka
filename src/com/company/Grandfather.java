package com.company;

public class Grandfather extends Actors {

	private static Grandfather grandfather = null;	
	
	int power = 6;
	
	private Grandfather() {
		
	}
	
	public static Grandfather getGrandfather() {
        if (grandfather == null)
           grandfather = new Grandfather();
        return grandfather;
	}
	
	
	@Override
	void call(Actors smth) {
		
		System.out.println("i'm calling Grandma");
		Actors.currentPower +=  ((Grandmother) smth).power;

	}


	int pull(Repka repka) {
		
		repka.health -= currentPower;
		if(repka.conditionOfLife())
			System.out.println("We cannot pull Repka!");
		else
		System.out.println("We do this! End of Story");
	
		return repka.health;
	}
	
	public Repka raiseRepka(){
		
		Repka repka = new Repka();
		repka.size = "big";
		repka.state = "strong";
		repka.taste = "sweety";
		System.out.println("Grow big, strong, sweety");
		return repka;
	}

}
