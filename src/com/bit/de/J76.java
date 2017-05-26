package com.bit.de;

import bit.poly.Animal;
import bit.poly.Cat;
import bit.poly.Dog;

public class J76 {

	public static void main(String[] args) {

		Dog d = new Dog();
		eatPrint(d);

		Cat c = new Cat();
		eatPrint(c);

	}

	private static void eatPrint(Animal c) {
		// TODO Auto-generated method stub
		c.eat();
	}

}
