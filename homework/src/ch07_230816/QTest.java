package ch07_230816;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class QTest {
	static int mid2(int x, int y, int z) {
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

	@Test
	void test1() {
		assertTrue(mid2(2,1,3)==3); // �޼ҵ��� ����� 2�� ����.
	}

	@Test
	void test2() {
		assertTrue(mid2(1,3,3)==3);
	}

}
