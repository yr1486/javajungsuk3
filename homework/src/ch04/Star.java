package ch04;

//����Ǯ�� ����
//1. ������ ������.
//2. ������ ���� �����.

public class Star {
	
	// i�� j�� ��ġ, ������ �˱�
	public static void ex0() {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(true) {
					System.out.print("[" + i + "," + j + "]"); // [i,j]
				}
			}
			System.out.println();
		}
	}

	
	public static void ex1() { // ����� 1
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//  System.out.println("*****"); �� �ڵ嵵 �ݺ��� ��������ϱ� �ڵ� �ٿ�����.
	}
	
	public static void ex2() { // ������ ��� //  ����� 2
		
		// ù��° �ٿ� 1��°, �ι�° �ٿ� 2��°, 3��° �ٿ� 3��°�� ��µǰ� �ϸ� �ȴ�. => ��Ģ�� ã��.
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) { 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex3() { // �������� // ����� 3
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j==6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex4() { // ������� // ����� 4  // 2�� ������ 3�� ������ ��ģ �� ( ������ : ||, ������ : && )
	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j==6 || i==j) { 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	// ó���� �������� ���� �ʰ�, else if�� ����ߴµ�, �������� ����ϴ� �ڵ尡 �� ����������	
	}
	
	
	public static void ex5() { // ����� 5

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i>=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void ex6() {
		
		for(int i=1; i<=5; i++) { 
			for(int j=1; j<=5; j++) {
				if(i+j>=6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void ex6_1() { // ����� 5

		
		for(int i=1; i<=5; i++) { 
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void ex7() {  // �������� 5���� 1�� ����
			
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i+4; j++) { // �� i+4�ϱ�? �� ���� �����غ���. �� j�� ���̰� 9. 9-i=4
				if(true) { 
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
		
		
	}
		
	public static void ex8() { // �Ƕ�̵�
	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i+4; j++) {
				if(i+j>=6) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	
	public static void ex9() { // ������ �ڵ�1

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i>=j || i+j>=6) && (i<=j || i+j<=6)) {//10���� !�� ���̰�, = ��ȣ ���� �Ȱ��� ���� ������. (i>=j && i+j>=6) || (i<=j && i+j<=6)
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex9_1() { // �𷹽ð��� �ڵ�2

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(!((i>j || i+j>6) && (i<j || i+j<6))) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex10() { // �𷡽ð���
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i>=j && i+j>=6) || (i<=j && i+j<=6)) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void ex11() { // ������ ��� 

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if( (i==3||j==3)||(i==j)||(i+j==6) ) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ex12() { // ������ ����
		       
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				if((i>=j || i+j>=6) && (i<=j || i+j<=6)) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		ex0();
	}

}
