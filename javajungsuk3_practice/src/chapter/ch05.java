package chapter;

public class ch05 {
	public static void ch5_3() {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum= " + sum);
	}
	public static void ch5_4() {
		int[][] arr = { 
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
				
		};
	
//		System.out.println(arr[1].length);
		int total = 0;
		float average = 0;
		
		for(int i=0; i<arr.length; i++) { // 4
			for(int j=0; j<arr[i].length; j++) { // 5
				total += arr[i][j];
				average = total/(arr.length*(float)arr[i].length);
			}
		}
		System.out.println("total= " + total);
		System.out.println("average= " + average);
	}
	public static void ch5_5() {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		// �迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for(int i=0; i< ballArr.length;i++) {
		int j = (int)(Math.random() * ballArr.length);
		int tmp = 0;
		/*
		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/ }
		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		/* (2) */
		for(int i=0;i<ball3.length;i++) {
		System.out.print(ball3[i]);
		}
		
	}
	
	public static void ch5_6() {
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
		/*
		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/ }
		
	}
	
	public static void ch5_8() {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for(int i=0; i < answer.length;i++) {
		/* (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. */ }
		for(int i=0; i < counter.length;i++) {
		/*
		(2) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
		*/
		System.out.println();
		}
	}
	
	public static void ch5_9() {
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
				};
				char[][] result = new char[star[0].length][star.length];
				for(int i=0; i < star.length;i++) {
				for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
				}System.out.println();
				}
				System.out.println();
				for(int i=0; i < star.length;i++) {
				for(int j=0; j < star[i].length;j++) {
				/*
				(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
				*/ }
				}
				for(int i=0; i < result.length;i++) {
				for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
				}System.out.println();
				}
	}
	public static void ch6() { // 2�� for�� �⺻
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ch5_5();
	}
}
