package ch07_230816;

public class Q123 {
	// Q1. �� ���� ���� x,y,z�� �޾Ƽ� �߰� ũ���� ���� ��ȯ�ϴ� mid��� �޼��� �ۼ��Ͻÿ�. 
	static int mid2(int x, int y, int z) {
		// ���� ���� ���� �غ��� !
		if(x>y) {
			if(z>x) {
				return x;
			}
			else if(y>z) {
				return y;
			}
			else {
				return z;
			}
		}
		else { // x<=y
				if(z<x) {
					return x;
				}
				else if(y<z) {
					return y;
				}
				else { return z; }
		}
	}
	static int mid(int x, int y, int z) {
		int[] tmp = {x, y, z};
		for(int i=0; i<tmp.length-1; i++) {
			for(int j=0; j<tmp.length-1-i; j++) { // -i : ���� ����
				if(tmp[i]>tmp[i+1]) {
					int tt = tmp[i];
					tmp[i] = tmp[i+1];
					tmp[i+1] = tt;
				}
			}
		}
//		System.out.println(Arrays.toString(tmp));
		return tmp[1];
	}
	//Q2. 5x5 ũ���� 2���� �迭�� �޾Ƽ� ������ ������ ��� ��ȯ�ϴ� �޼��� bingoCount()�� �ۼ��ϰ� �׽�Ʈ �Ͻÿ�
	// �ϴ� 2���� �迭 �ϳ� �����
	// ���� ���� �밢�� ���� ���� ���� �� ���ϴ� �ڵ带 �Ẹ��.
	// ���� ���� �밢���� for�� �ȿ� ���ǽ� 3���� �ɰ� �־ ������ �㳪..
//	int bingoCount(int[][] arr) {
//		int bingoCnt = 0;
//		return bingoCnt;
//	}
	static int bingoCount(int[][] arr) {
		int bingoCnt=0;
		
		int cross1 = 0; // \
		int cross2 = 0; // /
		int garo = 0;
		int sero = 0;

		// ����
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==1) {
//					if()
					cross1++; // i�� j�� ��Ģ�� ã�Ƽ�. ���ϸ� ���⿡ �� �ִ�����.
				}
			}
			System.out.println();
		}
		System.out.println(cross1);

		// ����
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
	
			}
			System.out.println();
		}

		
		// �밢��
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==j) { cross1++; }
				else if(i+j==4) {cross2++;}
//				else if(bing[i])
			}
			System.out.println();
		}
		System.out.println(cross1);
		System.out.println(cross2);
	
		return bingoCnt;
		
	}
	//Q3 5���� ī�带 �迭�� �޾Ƽ� ����� ���ڿ��� ��ȯ�ϴ� rank check �޼��带 �ۼ��Ͻÿ�
	// ��� ����
	// 1. "NO RANK"
	// 2. "1 PAIR" ���� ���� �ѽ�
	// 3. "2 PAIR" ���� ���� �ν�
	// 4. " THREE CARD" ���� ī�� 3��
	// 5. "STRAIGTH" ���� ���� 5��(2,3,4,5,,6)
	// 6. "FLUSH
	static void rankCheck() {
		
	}
	public static void main(String[] args) {
		//mid2
		System.out.println(mid2(5, 1, 4));
		
		//mid
		System.out.println(mid(2, 1, 4));
		
		//Q2
		int[][] arr = {
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}

				};
		System.out.println(bingoCount(arr));
	
	}

}
