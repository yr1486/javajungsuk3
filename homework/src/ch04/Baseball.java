package ch04;

public class Baseball {
	public static void main(String[] args) {
		
		// �� �迭�� ���ٴ� �� ������ .
		
		boolean same = false;
		
		int[] a = {1,2,3};
		int[] b = {1,6,3};
		
		// �� �迭�� ������ ��� ����?
		// ���� ���ؾ���. => ���� ��ġ�� �ִ� ���� ����.
		// ������ Ʈ���.
		
		/*
		if(a[0] == b[0]) {
			��� �ε����� ���ƾ� ��.
			same = true;
		}
		
		
		a[0] == b [0] && a[1] == b[1] && a[2] == b[2]
		
		*/
		
		for(int i=0; i<3; i++) {
			if(a[i] == b[i]) {
				same = true;
				System.out.println("a�� b�� �迭�� �����ϴ�.");
			}
			else {
				System.out.println("a�� b�� �迭�� �ٸ��ϴ�.");
			}
			
		}
		System.out.println();
		
//		if(a[0] == b [0] && a[1] == b[1] && a[2] == b[2])

	}

}
