package ch06;

class StudentTest {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.name="홍길동";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		System.out.println("이름:"+s.name);
		System.out.println(s.getTotal());
		System.out.println(s.getAverage());
		
		
		Student s2 = new Student("홍길동",1,1,100,60,76);
//		System.out.println(s.info());

	}
}

class Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student() {
		
		
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
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
		// 객체 정보를 반환해주는 거 같은데..
		// 어떤식으로 담고 있어야 할까..
		Student std = this;
		
		// 배열 안되지 . 같은 타입만 되니까....
		// 정보를 반환하는 메서드
		// 어디서 봤는데..
		// toString 오버로딩하는거같은데...............아닌가봄
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

}

