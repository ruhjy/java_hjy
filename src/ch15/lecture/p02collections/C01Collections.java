package ch15.lecture.p02collections;

import java.util.*;

public class C01Collections {
	public static void main(String[] args) {
		// 수정불가 리스트
		List<String> list1 = List.of("java", "css", "spring", "jsp", "html");
		// 수정가능 리스트로 다시 만듬
		List<String> list2 = new ArrayList<>(list1);

		// sort
		Collections.sort(list2);
		System.out.println(list2);

		// max
		String maxStr = Collections.max(list1);
		System.out.println(maxStr);

		// min
		String minStr = Collections.min(list1);
		System.out.println(minStr);

		// reverse
		Collections.reverse(list2);
		System.out.println(list2);

		// fill
		Collections.fill(list2, "web");
		System.out.println(list2);

		System.out.println("------------------------");
		// ??
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 8, 5, 4, 2);

		Collections.sort(list3);
		System.out.println(list3);
		
		Integer maxInt = Collections.max(list3);
		System.out.println(maxInt);
		
		Integer minInt = Collections.min(list3);
		System.out.println(minInt);
		
		Collections.reverse(list3);
		System.out.println(list3);
		
		Collections.fill(list3, 10);
		System.out.println(list3);
	}
}
