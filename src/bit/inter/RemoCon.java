package bit.inter;

//클래스의 일종임
public interface RemoCon {
	// 인터페이스는 바디를 넣으면 안됨

	// 기능 정의함
	public void chUp();

	public void chDown();

	public void volUp();

	public void volDown();

	public void internet();// tv


	// 인터페이스: 서로 기능이다른 클래스의 공통부분을 묶을 때 사용
	// 1. 객체를 생성할 수 없다
	// 2. 부모의 역할은 가능 upcasting
	// 3. 추상메서드는 자식이 반드시 재정의 해야한다 override
	// 4. ★☆다형성을 100% 보장한다
	// 5. 다중 상속을 보완하기 위해서 사용함

}
