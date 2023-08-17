package ch07_230816;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class QTest {
	int mid(int x, int y, int z) {
	int[] tmp = {x, y, z};
	
	for(int i=0; i<tmp.length-1; i++) {
		for(int j=0; j<tmp.length-1-i; j++) { // -i : 버블 정렬
			if(tmp[i]>tmp[i+1]) {
				int tt = tmp[i];
				tmp[i] = tmp[i+1];
				tmp[i+1] = tt;
			}
		}
	}
	return tmp[1];
}

	@Test
	void test1() {
		assertTrue(mid(2,1,3)==2); // 메소드의 결과가 2와 같냐.
	}

	@Test
	void test2() {
		assertTrue(mid(1,3,3)==3);
	}

}
