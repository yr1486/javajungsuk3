package ch06;
// ���� �ڵ��� ���� ����� �����Ͽ� �����ÿ�.
public class Exercise6_19 {

	public static void change(String str) {
		str += "456";
		
	}
	public static void main(String[] args) {
		
		String str = "ABC123";
		System.out.println(str); // ���ο� str : ABC123
		change(str); // ȣ�⸸ ��.
		System.out.println("After change:" + str); // �ٽ� ���ο� str: ABC123 

		// => change�޼����� str�� ���������̱� ������ !!!! �̸��� ���� �� �ٸ� ���� ����.
	}

}
