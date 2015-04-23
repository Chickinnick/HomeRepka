package com.company;

public class TestClass {

	public static void main(String[] args) {
		
	
		Grandfather grandfather = Grandfather.getGrandfather();
		Grandmother grandmother = Grandmother.getGrandmother();
		Girl girl = Girl.getGirl();
		Dog dog = Dog.getDog();
		Cat cat = Cat.getCat();
		Mouse mouse = Mouse.getMouse();
		
		
		
		Repka repka = grandfather.raiseRepka();
		
		System.out.println("Start of puuling");
				
		grandfather.pull(repka);

		grandfather.call(grandmother);
		grandfather.pull(repka);
		
		grandmother.call(girl);
		grandfather.pull(repka);		
		
		girl.call(dog);
		grandfather.pull(repka);

		dog.call(cat);
		grandfather.pull(repka);
		
		cat.call(mouse);
		grandfather.pull(repka);		
	
	}
}
