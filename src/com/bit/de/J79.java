package com.bit.de;

import bit.abs.Animal추상;
import bit.abs.Cat;
import bit.abs.Dog;

public class J79 {

	public static void main(String[] args) {
		
		
		// Animal ani = new Animal(); //추상 클래스는 객체를 생성할 수 없다.
		
		Animal추상 ani=new Dog(); //부모혼자서는 못하지만 자식이 오면 가능
		                      // 부모의 역할은 가능
		ani.eat();
		ani.move();
		
		ani=new Cat();
		ani.eat();
		ani.move();
		
		
		
		
	}

}
