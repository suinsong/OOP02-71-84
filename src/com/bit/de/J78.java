package com.bit.de;

import bit.abs.Animal�߻�;
import bit.abs.Cat;
import bit.abs.Dog;

public class J78 {

	public static void main(String[] args) {
		// Dog��ü�� ���۽�Ű���� �Ѵ� upcasting���� ��ü�� �����Ͻÿ�.
		
		
		Animal�߻� d=new Dog();
		d.eat();

		
		d=new Cat();
		d.eat();
	}

}
