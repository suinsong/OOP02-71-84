package com.bit.de;

import bit.poly.Animal;
import bit.poly.Cat;
import bit.poly.Dog;

public class J77 {

	public static void main(String[] args) {

		// 메시지 다형성polymorphism
		// 정의: 상소관계에 있는 상위 클래스가 동일한 메시지로 
		// 하위클래스를 서로 다르게 반응시키는 원리
		// [다형성 원리의 전제조건]
		// 1. 상속관계
		// 2. 상위 클래스가 명령내려야 함 (upcasting 자동형변환)
		// 3. 재정의가 되어 있어야 함 [override 다형성 보장여부를 결정]
		// 4. 동적바인딩(실행시점에서 사용될 메서드가 결정되는 바인딩)
		//
		Animal ani = new Dog();
			   ani.eat();

			   ani = new Cat();
			   ani.eat();

	}
}
