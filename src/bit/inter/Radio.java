package bit.inter;

public class Radio implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("Radio�� chUp");

	}

	@Override
	public void chDown() {
		System.out.println("Radio�� chDown");

	}

	@Override
	public void volUp() {
		System.out.println("Radio�� volUp");

	}

	@Override
	public void volDown() {
		System.out.println("Radio�� volDown");

	}

	@Override
	public void internet() {
		System.out.println("Radio�� internet����� �������� ����");

	}

}
