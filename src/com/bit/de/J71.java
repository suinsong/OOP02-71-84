package com.bit.de;

import bit.edu.Cat;
import bit.edu.Dog;

public class J71 extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dog��ü�� �����Ͻÿ�
		
		//��Ӱ��迡 �ִ� Ŭ�����鰣�� ��ü�����ϴ� �����?
		Dog d=new Dog();
		d.setAge(3);
		d.setName("�ٵ���");
		
		System.out.println(d.getAge()+"\t"+d.getName());

		
		
		Cat c=new Cat();
		c.setAge(2);
		c.setName("�̹�");
		c.setPart("��Ʈ��Ʈ���");
		System.out.println(c.getAge()+"\t"+c.getName()+"\t"+c.getPart());
	
	}

}
