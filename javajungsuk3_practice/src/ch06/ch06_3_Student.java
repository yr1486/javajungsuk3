package ch06;

public class ch06_3_Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	ch06_3_Student() {
		
		
	}
	
	ch06_3_Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	int getTotal() {
		return kor + eng + math;
		}
	
	float getAverage() {
		int total = kor + eng + math;
		float avg = (Math.round((total/(float)3)*10))/10f;
		return avg;
	}
	
	void info() {
		
		// �迭 �ȵ��� . ���� Ÿ�Ը� �Ǵϱ�....
		// ������ ��ȯ�ϴ� �޼���
		// ��� �ôµ�..
		// toString �����ε��ϴ°Ű�����...............�ƴѰ���
		System.out.println();
	}
	
	
//	String info() {
////		if (num <= 0 || num > 10)
////			return;
//		if(iskwang==true) {
//			return num+"K";
//			
//		}
//		else {
//			return num + "";
//		}
//	}

	public static void main(String[] args) {
		ch06_3_Student s = new ch06_3_Student();
		s.name="ȫ�浿";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		
		System.out.println("�̸�:"+s.name);
		System.out.println(s.getTotal());
		System.out.println(s.getAverage());
		ch06_3_Student s2 = new ch06_3_Student("ȫ�浿",1,1,100,60,76);
//		System.out.println(s.info());
		
	}

}
