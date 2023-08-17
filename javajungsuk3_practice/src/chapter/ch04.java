package chapter;

public class ch04 {
	public static void ch4_2() {
		int sum = 0;
		int[] arr = new int[20];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			if(!(arr[i]%2==0||arr[i]%3==0)) {
				sum += arr[i];
			}
		}
		System.out.println(sum); // 73
		
	}
	// 1+2+3+4+5+....+10�� ����� ����Ͻÿ�
	public static void ch4_3_1() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		// ���� : ������ sum = sum + i; �� �Ǿ���
		//            1     0   +  1
		// ���� �հ�
	}
	//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�.
	public static void ch4_3() {
		int sum = 0; 
		int total = 0; // �̰� ������... ������� �������� �׸� �ٽ� �׷�����.
		// int sum; �� �� �ȵɱ�? ����� �޼ҵ� ������? �������� �̱� ������ �ʼ��� �ʱ�ȭ���� ����� �Ѵ�.
		for(int i=1; i<=10; i++) { // i�� 1���� ���۵Ǿ� �ϴ� �� ��������
			sum += i;
			total += sum;
		}
		System.out.println(total);
		
	}
	// 1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������
	// 100�̻��� �Ǵ��� ���Ͻÿ�.
	public static void ch4_4() {
		int sum = 0;
		int i = 1;
		for(;; i++) {
			if(i%2==1) {
				sum += i; // 1 
//				System.out.println(i);
			}
			else {
				sum = sum -i; // 1 3 5 7 
//				System.out.println(-i);
			}
			if(sum>=100) {
				break;
			}		
		}
//		System.out.println(sum);
		System.out.printf("%d \t %d%n", i, sum);
		
	}
	//1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������
	//100�̻��� �Ǵ��� ���Ͻÿ�.
	public static void ch4_4_1() {
		int sum = 0, i = 1;
		
		for(;;i++) {
			if(i%2==0) {
				sum += -i;
			}
			else {
				sum += i;
			}
			
			if(sum>=100) {
				break;
			}
			System.out.printf("%d \t %d%n", i, sum);
		}
		
		
	}
	public static void ch4_5() {
		int i=0, j=0;
		while(i<=10) { // true
			while(j<=i) { 
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			}
	}
	// �ΰ��� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
	public static void ch4_6() {
		for(int i=1, j=5; i<=5; i++) {
			System.out.printf("%d + %d = %d%n", i, 6-i, i+(6-i));
		}
	}
	public static void ch4_5_1() {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// �� ���� 
	public static void ch4_9() {
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
//			sum = charAt(str[i]);
		}
		System.out.println("sum="+sum);
	}
	public static void ch4_12() {
		for (int i=1; i<=3; i++) {
			for (int j=2;j<=9; j++) {
				if(i==i) {
					System.out.print(j + "*" + i + "=" + (j * i) + "\t");
				}
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
		System.out.println(1+2);
	}

	public static void main(String[] args) {
		ch4_12();
	}

}
