package com.bit.de;

import bit.abs.Animal�߻�;
import bit.abs.Cat;
import bit.abs.Dog;

public class J80 {

	public static void main(String[] args) {
		// �������� Ȱ��- ������ �迭
		// Dog, Cat 2���� ��ü�� ������ �迭�� �����Ͻÿ�

		Animal�߻�[] a = new Animal�߻�[2];
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
		
		 // �ٿ� ĳ����

	}

}
