package codetest.leetcode;

import java.util.*;

public class Solution2206 {
	public boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		// 각 값이 몇개인지 세는 코드
		// 3 2 3 2 2 2
		for (int n : nums) {
			if (map.containsKey(n)) {
				// 키 n의 값을 1 더해서 다시 entry에 넣는다.
				int oldvalue = map.get(n);
				map.put(n, oldvalue + 1);
			} else {
				map.put(n, 1);
				/*
				 * (3 , 2) (2 , 4)
				 */
			}
		}

//		// 각 값이 몇개인지 세는 코드
//		// 1 2 3 4
//		for (int n : nums) {
//			if (map.containsKey(n)) {
//				// 키 n의 값을 1 더해서 다시 entry에 넣는다.
//				int oldvalue = map.get(n);
//				map.put(n, oldvalue + 1);
//
//			} else {
//				map.put(n, 1);
//				/*
//				 * (1 , 1) (2 , 1) (3 , 1) (4 , 1)
//				 */
//			}
//		}

		// value가 홀수 인게 있으면 return false;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int v = entry.getValue();
			if (v % 2 == 1) {
				return false;
			}
		}

		return true;
	}
}

//	public static void main(String[] args) {
//		Solution2206 o1 = new Solution2206();
//
//		Map<Integer, Integer> map = new HashMap<>();
//		int[] nums1 = { 3, 2, 3, 2, 2, 2 };
//		int[] nums2 = { 1, 2, 3, 4 };
//		// 각 값이 몇개인 세는 코드
//		// 3 2 3 2 2 2
//		for (int n : nums1) {
//			if (map.containsKey(n)) {
//				// 키 n의 값을 1 더해서 다시 entry에 넣는다.
//				int oldvalue = map.get(n);
//				map.put(n, oldvalue + 1);
//
//			} else {
//				map.put(n, 1);
//				/*
//				 * (3 , 2) (2 , 4)
//				 */
//			}
//		}
//		System.out.println(map);
//		map.clear();
//
//		// 각 값이 몇개인 세는 코드
//		// 1 2 3 4
//		for (int n : nums2) {
//			if (map.containsKey(n)) {
//				// 키 n의 값을 1 더해서 다시 entry에 넣는다.
//				int oldvalue = map.get(n);
//				map.put(n, oldvalue + 1);
//
//			} else {
//				map.put(n, 1);
//				/*
//				 * (3 , 2) (2 , 4)
//				 */
//			}
//		}
//		System.out.println(map);
//	}
