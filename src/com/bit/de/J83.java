package com.bit.de;

import bit.inter.Radio;
import bit.inter.RemoCon;
import bit.inter.TV;

public class J83 {

	public static void main(String[] args) {

		// RemoCon으로 TV를 동작시키시오.
		RemoCon r = new TV();
		r.chDown();
		r.chUp();
		r.volDown();
		r.volUp();
		r.internet();

		System.out.println();

		// RemoCon으로 Radio를 동작시키시오
		r = new Radio();
		r.chDown();
		r.chUp();
		r.volDown();
		r.volUp();
		r.internet();

	}

}
/*
 * 서로 기능이 비슷한 클래스들의 공통을 묶을 때 사용하는 클래스 = 추상클래스 서로 기능이 다른 클래스들의 공통을 묶을 때 사용하는 클래스
 * = 인터페이스
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */