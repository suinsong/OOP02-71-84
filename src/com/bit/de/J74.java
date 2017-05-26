package com.bit.de;

import bit.poly.Animal;
import bit.poly.Cat;

public class J74 {

	public static void main(String[] args) {
		//parents  children
//		Cat c = new Cat();  // <----- Cat.java(source) / Cat.class(product)
//		c.eat();

		
		Animal a= new Cat(); // <------Animal.java/ Animal.class
		a.eat();
		
		Cat c= (Cat)a;
		c.night();
		//((Cat)a).night();
		
		
	}

}
