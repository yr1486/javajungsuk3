

public class Practice {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		b.buy(new Tv3());
		b.buy(new Computer());
		System.out.println("���� ���� ����" + b.money);
		System.out.println("���� ���� ����" + b.bonusPoint);
		
	}
}

