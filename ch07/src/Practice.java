

public class Practice {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		b.buy(new Tv3());
		b.buy(new Computer());
		System.out.println("현재 남은 돈은" + b.money);
		System.out.println("현재 남은 돈은" + b.bonusPoint);
		
	}
}

