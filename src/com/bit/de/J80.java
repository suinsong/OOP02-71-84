package com.bit.de;

import bit.abs.Animal추상;
import bit.abs.Cat;
import bit.abs.Dog;

public class J80 {

	public static void main(String[] args) {
		// 다형성의 활용- 다형성 배열
		// Dog, Cat 2개의 객체를 저장할 배열을 생성하시오

		Animal추상[] a = new Animal추상[2];
		a[0] = new Dog();
		a[1] = new Cat();

		
//		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			a[i].eat();
			if (a[i] instanceof Cat) {
				((Cat) a[i]).night();
			}
		
		}

		
		System.out.println();
		
		 // 다운 캐스팅

	}

}
