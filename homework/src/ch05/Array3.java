package ch05;

import java.util.Arrays;

public class Array3 {

	// 1���� �迭�� arr ������ 2���� �迭�� 4�� 3�� arr2�� �����Ͽ� ����Ͻÿ�
	
	
	public static void main(String[] args) {
		int[] arr = new int[12];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		// ---------------------------------------------------
		
		// arr[i/3][i%3]
		// ����� ��� �ϴ°��� ?
		int[][] arr2 = new int[4][3];
	
		for(int i=0; i<arr2.length; i++) { // ��4
			for(int j=0; j<arr2[i].length; j++) { //��3
//				if(arr2[i]) {
					
					arr2[i][j] = arr[arr[i]++];
//				}
				System.out.print(arr2[i][j] + "");
				
			}
			System.out.println();
		}
	
	
	
	
	

	}
}
