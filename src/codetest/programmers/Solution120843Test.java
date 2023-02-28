package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution120843Test {

	@Test
	void test() {
		Solution120843 o1 = new Solution120843();

		assertEquals(3, o1.solution(new int[] { 1, 2, 3, 4 }, 2));
		assertEquals(3, o1.solution(new int[] { 1, 2, 3, 4, 5, 6 }, 5));
		assertEquals(2, o1.solution(new int[] { 1, 2, 3 }, 3));
	}

}
