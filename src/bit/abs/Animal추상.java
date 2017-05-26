package bit.abs;

public abstract class Animal추상 { // 추상 클래스 (장애 클래스)

	public abstract void eat(); // 추상 메서드 (다형성 보장)
	
	public void move(){ // 구상 메서드
		System.out.println("무리를 지어서 이동한다.");
	}
		
	
	/*
	 * 추상 클래스: 서로 기능이 비슷한 클래스의 공통부분을 묶을 때 사용
	 * 1. 객체를 생설할 수 없음 Animal ani=new Animal ㄴㄴ안됨
	 * 2. 부모의 역할은 가능(객체를 생성할 때 upcasting)
	 *     Animal ani=new Dog();
	 * 3. 추상메서드는 자식이 반드시 재정의override해야 함
	 * 4. ★☆다형성을 '일부' 보장함    
	 *
	 *
	 *
	 *	 
	 * 
	 */
}
