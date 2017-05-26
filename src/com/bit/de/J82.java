package com.bit.de;

import bit.abs.*;

public class J82 {

	public static void main(String[] args) {
		Dog d = new Dog();
		aniPtr(d);

		Cat c = new Cat();
		aniPtr(c);

	}

	public static void aniPtr(Animal√ﬂªÛ c) {
		c.eat();
		if (c instanceof Cat) {
			((Cat) c).night();
		}

	}

}
