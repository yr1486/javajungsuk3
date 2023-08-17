package ch05;

public class Array2 {
	//Q1 �� �迭 arr, arr2�� ������ Ȯ���ؼ� ������ "�����ϴ�", �ٸ��� "�ٸ��ϴ�" �� ����Ͻÿ�
	// ���ٴ°� ���� ? = ��� ����� ���� ���� ��.
	public static void ex1_1(){
		int[] arr = {1,2,1};
		int[] arr2 = {1,3,1};
		boolean eq =true;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] != arr2[i]) {
				eq=false; 
				break; //���� ����� �ݺ����� �극��ũ
			}
		}
		
		if(eq==true){
			System.out.println("�����ϴ�");
		}
		else {
			System.out.println("�ٸ��ϴ�.");
		}
	}
	
	public static void ex1_2(){
		int[] arr = {1,2,3};
		int[] arr2 = {4,2,3};
	
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==arr2[i]) cnt++;
		}
		if(cnt==3) {
			System.out.println("�����ϴ�");
		}
		else {
			System.out.println("�ٸ��ϴ�");
		}
		
	}
	
	public static void ex1_3(){
		int[] arr = {1,2,3};
		int[] arr2 = {4,1,2};
	
		int s = 0;
		int b = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr[i]==arr2[j]) { // ��ġ�� ���� ���� ��
					if(i==j) s++; // ��ġ�� ���� ���� ������ s
					else b++; // ��ġ�� �ٸ��� ���� ������ b
				}
			}
		}
		System.out.println(s + "s" + b + "b");
	}
	
	//Q2 �� �迭�� ���� ���ؼ� ���� ���� ����(b)�� ����Ͻÿ�
	// �� ���� ��ġ��(�ε���) ������ �� ������ ����Ͻÿ�
	public static void ex2(){
		int[] arr = {1,2,3};
		int[] arr2 = {3,2,1}; // 321 1s2b 412 2b
		
		int strike = 0; // ���� ��ġ�� ��ġ�ϴ� ��� // ��: arr[i] => ��ġ : arr[i]�� i
		int ball = 0; // ���� ���� ��ġ�� �ٸ����
		
		// ���� ��ġ�ϴ� ���
		// arr[i] == arr2[j]
		// ��ġ�� ��ġ�ϴ� ���
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr2.length; j++) {//��
				if(arr[i]==arr2[j]) { //�� // ��
					if(i==j) {
						strike++;
					}
					else {
						ball++;
					}
				}
			}
		}
		System.out.println(strike + "S" + ball + "B");
		
	}
	//Q3 �迭 arr�� �̿� ���� �� 
	//1.�ߺ����� => 1,2,3,4,5,7 // 2.���� => 1 1 2 2 2 3 3 4 4 5 �� ����� ����Ͻÿ�
	//�迭 1���� for�� 1���� ����ؼ� �ϱ�.
	public static void ex3(){
		int[] arr = {4,2,2,4,1,7,3,2,5,1,3}; // 11
		
		// �� �迭 �ϳ� ������ ��.
		int[] cnt = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			cnt[arr[i]]++;
		}

		for(int i=0; i<cnt.length; i++) {
			System.out.printf("cnt[%d]=%d%n", i, cnt[i]);
		}
			
//			if(arr[i]==counter[i]) {
//				System.out.println();
//			}
//			else {
//				
//			}
		/*
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i < numArr.length; i++) {
			counter[numArr[i]]++; // 0, 1 , 2 .....
		}
 		
		for(int i=0; i < numArr.length; i++) {
			System.out.println(i + "�� ����" + counter[i]);
		}
		*/
	}

	public static void main(String[] args) {
		ex3();
	}

}
