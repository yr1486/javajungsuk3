class Car22 {
	int door = 2;
	String color = "yellow";
}

class Fire extends Car22 {
	
	void water() {
		System.out.println("�Ҳ���");
	}
}
public class Casting_My_Practice {
	public static void main(String[] args) {

		Car22 cc = new Fire();
		Fire ff = new Fire();
		
		ff = (Fire)cc; 
		// .. ����ȯ�� ������ �־�� �Ǵ°� �ƴѰ�?
		// ���������� �ٷ���ִ� ����� ������ �� �����ϱ�.
		
		ff.water();
		System.out.println(cc);
		System.out.println(ff);
	}

}
