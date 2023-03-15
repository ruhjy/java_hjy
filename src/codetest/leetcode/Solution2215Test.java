package codetest.leetcode;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.jupiter.api.*;

class Solution2215Test {

	@Test
	void test1() {
		Solution2215 o = new Solution2215();
		List<List<Integer>> result = o.findDifference(new int[] {1, 2, 3}, new int[] {2, 4, 6});
		assertNotNull(result);
		assertEquals(2, result.size());
		assertEquals(2, result.get(0).size());
		assertEquals(2, result.get(1).size());
		assertTrue(result.get(0).contains(1));
		assertTrue(result.get(0).contains(3));
		assertTrue(result.get(1).contains(4));
		assertTrue(result.get(1).contains(6));
	}
	
	@Test
	void test2() {
		Solution2215 o = new Solution2215();
		List<List<Integer>> result = o.findDifference(new int[] {1, 2, 3, 3}, new int[] {1, 1, 2, 2});
		assertNotNull(result);
		assertEquals(2, result.size());
		assertEquals(1, result.get(0).size());
		assertEquals(0, result.get(1).size());
		assertTrue(result.get(0).contains(3));
	}

}






