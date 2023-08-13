class Product22 {
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product22(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product22() {} // �⺻ ������
}

class Tv44 extends Product22 {
	Tv44() {
		super(100);	
	}
	public String toString() { return "Tv"; }
}

class Computer22 extends Product22 {
	Computer22() { super(200); }

	public String toString() { return "Computer"; }
}

class Audio22 extends Product22 {
	Audio22() { super(50); }

	public String toString() { return "Audio"; }
}

class Buyer22 {
	int money = 1000;
	int bpoint = 0;
	Product22[] item = new Product22[10];
	int i = 0;
	
	void buy(Product22 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
			}
		
		money = money - p.price;
		bpoint = bpoint + p.bonusPoint;
		// ���� �����ϱ�.
		item[i++] = p;
		System.out.println(p +"�� �����ϼ̽��ϴ�.");
		
	}
	
	void summary() {
		int sum = 0;
		String list = "";
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			
			sum += item[i].price;
			list += item[i] + ",";
		}
		System.out.println("�ѱݾ� " + sum);
		System.out.println("��� " + list);
	}
}


public class Practice {

	public static void main(String[] args) {

		Buyer22 b = new Buyer22();
		
		Tv44 tv = new Tv44();
		
		b.buy(new Audio22());
		b.buy(new Computer22());
		b.summary();
		b.buy(tv);
	}

}
