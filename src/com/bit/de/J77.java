package com.bit.de;

import bit.poly.Animal;
import bit.poly.Cat;
import bit.poly.Dog;

public class J77 {

	public static void main(String[] args) {

		// �޽��� ������polymorphism
		// ����: ��Ұ��迡 �ִ� ���� Ŭ������ ������ �޽����� 
		// ����Ŭ������ ���� �ٸ��� ������Ű�� ����
		// [������ ������ ��������]
		// 1. ��Ӱ���
		// 2. ���� Ŭ������ ��ɳ����� �� (upcasting �ڵ�����ȯ)
		// 3. �����ǰ� �Ǿ� �־�� �� [override ������ ���忩�θ� ����]
		// 4. �������ε�(����������� ���� �޼��尡 �����Ǵ� ���ε�)
		//
		Animal ani = new Dog();
			   ani.eat();

			   ani = new Cat();
			   ani.eat();

	}
}
