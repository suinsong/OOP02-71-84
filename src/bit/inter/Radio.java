package bit.inter;

public class Radio implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("Radio의 chUp");

	}

	@Override
	public void chDown() {
		System.out.println("Radio의 chDown");

	}

	@Override
	public void volUp() {
		System.out.println("Radio의 volUp");

	}

	@Override
	public void volDown() {
		System.out.println("Radio의 volDown");

	}

	@Override
	public void internet() {
		System.out.println("Radio의 internet기능은 지원하지 않음");

	}

}
