class Car222 {
	int door = 2;
	String color = "yellow";
}

class Fire22 extends Car222 {
	
	void water() {
		System.out.println("�Ҳ���");
	}
}
public class Casting_My_Practice2 {
	public static void main(String[] args) {

		Car222 cc = new Car222();
		Fire22 ff = null;
		
		ff = (Fire22)cc; 
		// ����ȯ ����
		// ��? ���������� �ٷ���ִ� ����� ������ �� ������ �ν��Ͻ��� ���.
		
		ff.water();
		System.out.println(cc);
		System.out.println(ff);
	}

}
