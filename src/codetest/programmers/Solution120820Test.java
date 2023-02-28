package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution120820Test {

	@Test
	void test() {
		Solution120820 o1 = new Solution120820();

		assertEquals(1983, o1.solution(40));
		assertEquals(2000, o1.solution(23));

	}
}
