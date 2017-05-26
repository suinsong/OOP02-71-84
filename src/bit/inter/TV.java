package bit.inter;

public class TV implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("TV의 chUp");
	}

	@Override
	public void chDown() {
		System.out.println("TV의 chDwon");

	}

	@Override
	public void volUp() {
		System.out.println("TV의 volUp");

	}

	@Override
	public void volDown() {
		System.out.println("TV의 volDown");
	}

	@Override
	public void internet() {
		System.out.println("TV의 internet이 실행됩니다");

	}

}
