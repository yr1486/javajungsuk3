package ch06;
class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();

		int result = r.add(3,5);
		System.out.println(result); // 8

		int[] result2 = {0,1}; // �迭�� �����ϰ� result2[0]�� ���� 0���� �ʱ�ȭ
		r.add(3,5,result2);  // �迭�� add�޼����� �Ű������� ����
		System.out.println("��ȯŸ���� �ִ� �޼ҵ��� �� :" + result2[0] + "," + result2[1]);

		r.add2(3,5,result2);  // �迭�� add�޼����� �Ű������� ����
		System.out.println("��ȯŸ���� ���� �޼ҵ��� �� :" + result2[0] + "," + result2[1]);
	
	}//main

	int add(int a, int b) {
		return a + b;
	}
	
	void add2(int a, int b, int[] result) {
		for(int i=0; i<result.length; i++)
			result[i] =a+b;
	}
	// ���� �޼ҵ带 ��ȯ���� ���� �޼ҵ�� ����� ����.
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;  // �Ű������� �Ѱܹ��� �迭�� �������� ����
		result[1] = a + b;  // �Ű������� �Ѱܹ��� �迭�� �������� ����
	}
}
