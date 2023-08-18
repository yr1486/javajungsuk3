package ch06_230818;

class PointTest {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(1, 1);
		System.out.println(p1);
		System.out.println(p2);

		System.out.println(Point.getDistance(p1, p2)); // ��ü ���� ���� �� �� �ִ� �޼ҵ�

		System.out.println(p1.getDistance(p2));

		Point3D p3 = new Point3D();
		System.out.println(p3);
	}
}
class Car {
	
}
class Point {
	
	int x;
	int y;

	Point() {
		this(1, 1);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x= " + x + ", y= " + y;
	}

	static double getDistance(Point p1, Point p2) {
		double x = (p1.x - p2.x);
		double y = (p1.y - p2.y);
		double result = Math.sqrt((x * x) + (y * y));
		return result;
	}

	double getDistance(Point p) {
		double x = this.x - p.x;
		double y = this.y - p.y;
		return Math.sqrt((x * x) + (y * y));
	}

	// equals()�� �������̵��ϱ�
	// ���ϴ� ��ü�� Point ��ü�� �ƴϸ� false�� ��ȯ
	// Point ��ü�� x�� y�� ���� ���� ���� true ��ȯ
	public boolean equals(Object obj) { // Point Ÿ���϶�, Car�϶�..
		if (!(obj instanceof Point)) {
			return false; // ������ ������ ���� ���ϰ� ������ �ٷ� �޼��� Ż��!!!!!!!!!!!!!!!!!!!!!!! �� ȣ���ѵ��� ���ϰ��� �Բ� ���ư�.
		}
		// if�� true�϶� �޼��尡 ������ ����!!!
		// true : Point Ÿ���� �ƴѵ� �Ʒ� ���� ���� ������ �ҿ� ���ݾ� 
		// ���� ���ǹ����� �ɷ������
		
		Point objectP = (Point)obj;
		boolean result = this.x == objectP.x && this.y == objectP.y;
		return result;

		
	}
}

class Point3D extends Point {
	int z;
	
	Point3D() {
	this(1, 1, 1);
	
	}
	
	Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public String toString() {

		return super.toString() + ", z= " + z;
	}
}








