class ArrayEx10_2 { // �ε��� �ڸ� �ٲٱ�
	public static void main(String[] args) {
		
		// �迭�� �ϳ� �������
		int[] numArr = new int[10];

		//�迭�� 0~9 ������ ä���ش�.
		for (int i=0; i < numArr.length ; i++ ) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		//�ٹٲ�
		System.out.println();

		// �迭�� ä�� ������ �����ٰž�. ���� �� ���ڸ��� ���ؼ� �����ִ� ����.
		// ���� �� �ϼ��Ȱ� Ȯ���ϱ� ���ؼ� ������ �ϳ� ����� �ٰž�
		// ���°� �ϼ� �ƴٸ� true
		for (int i=0; i < numArr.length-1 ; i++ ) {
			boolean changed = false;	// �ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.

			for (int j=0; j < numArr.length-1-i ;j++) {
				if(numArr[j] > numArr[j+1]) { // ���� ���� ������ ���� �ٲ۴�.
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;	// �ڸ��ٲ��� �߻������� changed�� true��.
				}
			} // end for j

			//���� �� ��������, ����. �ݺ����� ���߶�°ǰ�? ��¡.... �ݺ����� ������ �˾Ƽ� ������ �ʳ�?
			if (!changed) break;	// �ڸ��ٲ��� ������ �ݺ����� �����.

			// ���ĵ� ����� �� �������� ����غ���.
			for(int k=0; k<numArr.length;k++)
				System.out.print(numArr[k]); // ���ĵ� ����� ����Ѵ�.
			System.out.println();
		} // end for i
	} // main�� ��
}
