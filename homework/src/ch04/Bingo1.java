package ch04;

import java.util.Arrays;


// ����Ǯ�� ����
// 1. ������ ������.
// 2. ������ ���� �����.


public class Bingo1 {
	// ���̰� 1~25�� �ڼ��� ����� ���� 2���� �迭 ���� ����Ͻÿ�.
	// ������ �ɰ� ���� �ɰ� ����!!!! 
	// �ɰ��� Ǭ �ڵ忡 ������ �ִ��� �������� Ȯ���ϴ� ������ ����̱�
	
	public static void main(String[] args) {

		// 1. 1���� �迭 ����
		int[] arr = new int[25];
		
		// 2. 1���� �迭 �ʱ�ȭ
		for(int i=0; i<arr.length; i++) { // 0~24
			arr[i] = i+1; // 1~25
		}
		System.out.println(Arrays.toString(arr)); // �� �ڵ� ���� �𸣴� �Ŵϱ�. �ٽ� �����ϱ�

		// 3. 1���� �迭 ����
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*25)+1); // ���ϱ� 1 �ؾߵǴ°� �ƴѰ�?
		}
		// 4. 2���� �迭 ����
		int[][] bingo = new int[5][5];
		
		
		// 5. 1���� �迭 -> 2���� �迭 ä���
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				
			}
			arr[i] = i+1;
		}
		
		
		
		int tmp = 0;
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
			
		}
		
		
		
		// 2���� �迭 (5x5)�����ؼ� 1���� �迭�� �������� ä���.
		
		// ����
		/*
		int x = 1;
		int y = 3;
		int tmp2 = 0;
		
		tmp = x;
		x = y;
		y = tmp2;
		System.out.println(x);
		System.out.println(y);
		*/

	}

}
