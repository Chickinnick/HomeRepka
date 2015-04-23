package com.company;

public class Mouse extends Actors{

	
	private static Mouse mouse = null;
	
	int power = 1;
	
	private Mouse() {
		// TODO Auto-generated constructor stub
	}
	
	public static Mouse getMouse() {
		if (mouse == null) {
			return new Mouse();
		}
		return mouse;
	}
	
	@Override
	void call(Actors a) {
		return;
	}


}
