class BindingTest3{
	public static void main(String[] args) {
		Parent5 p = new Child5();
		Child5  c = new Child5();

		System.out.println("p.x = " + p.x); // 100
		p.method(); // �ڽ��� �޼ҵ�
		System.out.println();
		System.out.println("c.x = " + c.x); // 200
		c.method(); // �ڽ��� �޼ҵ�
	}
}

class Parent5 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child5 extends Parent5 {
	int x = 200;

	void method() {
		System.out.println("x=" + x);  // this.x�� ����.
		System.out.println("super.x=" + super.x);
		System.out.println("this.x="  + this.x);
	}
}
