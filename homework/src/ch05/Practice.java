package ch05;


public class Practice {

	public static void main(String[] args) {
		
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = Math.round((numOfApples/sizeOfBucket)+1);
		
		System.out.println("�ʿ��� �ٱ����� ��" + numOfBucket);
		
		int num = 111;
		System.out.println(num/100+"00");
		int num2 = 777;
		System.out.println(num2/10+"1");
		
		int x = 2;
		System.out.println(1+x<<33);
		
		int f = 100;
		float c = ( (int)( (((float)5/9)*(f-32))* 100+0.5f ) )/100f; 
		// ���ϴ� �Ҽ��� �ڸ����� ����Ϸ��� ��� �ؾ��ұ�
		
		System.out.println("fahrenheit: " +f);
		System.out.println("Celcius: "+c);
		
		// 
		char ch = 1;
		boolean b = ('a'<=ch&&ch<='z')? true : ('A'<=ch&&ch<='Z')? true : (0<=ch&&ch<=9); 
		System.out.println(b);
		
		char ch1 = 'A';
//		char lowerCase = ('A'<=ch1 && ch1<='Z')? charAt(ch1)+32 : ch1;
		 
		char ch3 = 0;
		if(0<=ch3&&ch3<=9) {
			boolean bb = true;
			System.out.println(bb);
		}
		
		
		
	}	

}
