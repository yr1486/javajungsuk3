package ch04;

// �� �ҽ����Ͽ�? public Ŭ������ 1�� ������.
class Point {
	
	int x;
	int y;
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	//Q1-4 �Ű������� �ִ� ������
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Q1-4 �⺻ ������
	Point(){
		this(1, 1);
	}
	
	// Q1-5
	static double getDistance(Point p1, Point p2) { // ��ü��������!!!! �϶�� static�� ������ϼ̴���.
		
		double xx = p1.x - p2.x; 
		double yy = p1.y - p2.y; 
		
		return Math.sqrt((xx * xx) + (yy * yy)); 
	}
	
	
	// Q1-6
	// ���� ������� �κ�
	double getDistance(Point p) {
		
		double xx = this.x - p.x; 
		double yy = this.y - p.y; 
			
		return Math.sqrt((xx * xx) + (yy * yy)); 
		
	}
	
	// Q1-7 
	/*
	 	Point Ŭ������ equals()�� ������ ���� �������� �������̵� �ϰ� �׽�Ʈ �Ͻÿ�
	 	- ���ϴ� ��ü�� Point��ü�� �ƴϸ� false�� ��ȯ
	 	- Point ��ü�� x�� y�� ���� ���� ���� true�� ��ȯ
	 */
	
		@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)) { //true �� ���ǹ��� �ɸ��� ����
			return false;
		}
			Point resultObj = (Point)obj;
			return (this.x == resultObj.x) && (this.y == resultObj.y);
	}
	
	
	
	
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Point3D(){
		this(1, 1, 1);
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y + ", z = " + z;
	}
}


public class PointTest {

	public static void main(String[] args) {

		Point p1 = new Point(3,5);
		System.out.println(p1);
		
		Point p2 = new Point(0,0);
		System.out.println(p2);
		
		
		// �Ÿ� ���
		// ó�� ���ڵ�
//		double dist = p1.getDistance(new Point(3,5), new Point(1,1)); // static�� ������, new �� �ʿ䰡 ����.
		
		double dist = Point.getDistance(p1, p2);
		
		// ó������ 0,0,0,0���� ���� �־ �Ÿ��� Ȯ���غ���.
		// �׷� ���� 0.0�� ���;���. �ƴ� 0,0,0,1�ϸ� 1.0 ���;߰���. 
		// �̷��� ���� �˱� ���� ���� ���� �־. ����ε� �ڵ尡 �´��� Ȯ���ذ���.
		System.out.println(dist);
		
		
		
		Point p3 = new Point(0,0);
		
//		System.out.println(p3.getDistance(p3));
		double dist3 = p2.getDistance(p3);
		System.out.println(dist3);
		
		
		// Q1-7�� ����ȯ ����
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		
	}

}
