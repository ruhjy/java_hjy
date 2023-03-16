package codetest.leetcode;

import java.util.*;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		// 1 2 3 2
		for (int i : nums) {
			if (map.containsKey(i)) {
				int oldValue = map.get(i);
				map.put(i, oldValue + 1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(map);

		int result = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1)
				result += entry.getKey();
		}
		return result;
	}
}

//	public static void main(String[] args) {
//		int[] nums1 = { 1, 2, 3, 2 };
//		int[] nums2 = { 1, 1, 1, 1 };
//		int[] nums3 = { 1, 2, 3, 4, 5 };
//		Map<Integer, Integer> map = new HashMap<>();
//		// 1 2 3 2
//		for (int i : nums3) {
//			if (map.containsKey(i)) {
//				int oldValue = map.get(i);
//				map.put(i, oldValue + 1);
//			} else {
//				map.put(i, 1);
//			}
//		}
//		System.out.println(map);
//
//		int result = 0;
//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			if (entry.getValue() == 1)
//				result += entry.getKey();
//		}
//
//		System.out.println("result : " + result);
//
//	}

class Teacher {

	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

//		int[] nums1 = { 1, 2, 3, 2 };
//		int[] nums2 = { 1, 1, 1, 1 };
//		int[] nums3 = { 1, 2, 3, 4, 5 };
		for (int n : nums) {
			map.putIfAbsent(n, 0);
			int oldValue = map.get(n);
			map.replace(n, oldValue + 1);
		}
		// (1, 0) -> (1, 1) -> (1, 2) -> (1, 3) -> (1, 4) -> (1, 5)
		
		// (1, 0) -> (1, 1)
		// (2, 0) -> (2, 1) -> (2, 2)
		// (3, 0) -> (3, 1)

		int sum = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();

			if (value == 1) {
				sum += entry.getKey();
			}
		}

		return sum;
	}
}
