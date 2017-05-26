package com.bit.de;

import bit.abs.*;

public class J81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		Cat c = new Cat();

		Animal추상[] a = { d, c, };
		aniPrint(a);
	}

	public static void aniPrint(Animal추상[] a) {

		for (int i = 0; i < a.length; i++) {
			a[i].eat();
			if (a[i] instanceof Cat) {
				((Cat) a[i]).night();
			}
		}
	}
}
