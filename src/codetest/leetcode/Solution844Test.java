package codetest.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution844Test {

	@Test
	void test1() {
		Solution844 o1 = new Solution844();
		assertTrue(o1.backspaceCompare("ab#c", "ad#c"));
	}
	
	@Test
	void test2() {
		Solution844 o1 = new Solution844();
		assertTrue(o1.backspaceCompare("ab##", "c#d#"));
	}
	
	@Test
	void test3() {
		Solution844 o1 = new Solution844();
		assertFalse(o1.backspaceCompare("a#c", "b"));
	}

}
