package com.bit.de;

import bit.edu.Cat;
import bit.edu.Dog;

public class J71 extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dog객체를 생성하시오
		
		//상속관계에 있는 클래스들간의 객체생성하는 방법은?
		Dog d=new Dog();
		d.setAge(3);
		d.setName("바둑이");
		
		System.out.println(d.getAge()+"\t"+d.getName());

		
		
		Cat c=new Cat();
		c.setAge(2);
		c.setName("미미");
		c.setPart("스트리트출신");
		System.out.println(c.getAge()+"\t"+c.getName()+"\t"+c.getPart());
	
	}

}
