package bit.inter;

public class TV implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("TV�� chUp");
	}

	@Override
	public void chDown() {
		System.out.println("TV�� chDwon");

	}

	@Override
	public void volUp() {
		System.out.println("TV�� volUp");

	}

	@Override
	public void volDown() {
		System.out.println("TV�� volDown");
	}

	@Override
	public void internet() {
		System.out.println("TV�� internet�� ����˴ϴ�");

	}

}
