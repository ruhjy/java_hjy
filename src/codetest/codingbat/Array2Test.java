package codetest.codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array2Test {

	@Test
	void test() {
		Array2 o1 = new Array2();

		int[] res1 = o1.fizzArray3(5, 10);
		int[] res2 = o1.fizzArray3(11, 18);

		assertArrayEquals(new int[] { 5, 6, 7, 8, 9 }, res1);
		assertArrayEquals(new int[] { 11, 12, 13, 14, 15, 16, 17 }, res2);
	}
}
