package com.bit.de;

import bit.inter.Radio;
import bit.inter.RemoCon;
import bit.inter.TV;

public class J83 {

	public static void main(String[] args) {

		// RemoCon���� TV�� ���۽�Ű�ÿ�.
		RemoCon r = new TV();
		r.chDown();
		r.chUp();
		r.volDown();
		r.volUp();
		r.internet();

		System.out.println();

		// RemoCon���� Radio�� ���۽�Ű�ÿ�
		r = new Radio();
		r.chDown();
		r.chUp();
		r.volDown();
		r.volUp();
		r.internet();

	}

}
/*
 * ���� ����� ����� Ŭ�������� ������ ���� �� ����ϴ� Ŭ���� = �߻�Ŭ���� ���� ����� �ٸ� Ŭ�������� ������ ���� �� ����ϴ� Ŭ����
 * = �������̽�
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */