package com.bit.de;

import bit.abs.Animal추상;
import bit.abs.Cat;
import bit.abs.Dog;

public class J78 {

	public static void main(String[] args) {
		// Dog객체를 동작시키려고 한다 upcasting으로 객체를 생성하시오.
		
		
		Animal추상 d=new Dog();
		d.eat();

		
		d=new Cat();
		d.eat();
	}

}
