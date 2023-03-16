package ch15.sec08;

import java.util.*;

import ch05.sec09.*;

public class ImmutableExample {
	public static void main(String[] args) {

		// List 불변 컬렉션 생성
		List<String> immutableList1 = List.of("A", "B", "C");
//		immutableList1.add("D"); // xx
		// Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A", "B", "C");
//		immutableSet1.remove("A"); // xx

		// Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B",
				3, "C");
		// immutableMap1.put(4, "D");

		// List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);

		// 수정 가능한 리스트로 만들기
		List<String> list2 = new ArrayList<>(immutableList2);
		list2.add("D");
		System.out.println(list2);

		// Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);

		// 수정 가능한 리스트로 만들기
		Set<String> set2 = new HashSet<>(immutableSet2);
		set2.add("E");
		System.out.println(set2);

		// Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);

		// Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map2 = new HashMap<>(immutableMap2);
		map2.put(4, "D");
		System.out.println(map2);

		// 배열로부터 List 불변 컬렉션 생성
		String[] arr = { "A", "B", "C" };
		List<String> immutableList3 = Arrays.asList(arr);
		// immutableList3.add("Z") // xx
		immutableList3.replaceAll(s -> s + s);
		System.out.println(immutableList3);

		int[] arr4 = { 3, 4, 5 };
		List<int[]> list4 = Arrays.asList(arr4);
		Integer[] arr5 = { 3, 4, 5 };
		List<Integer> list5 = Arrays.asList(arr5);

	}
}
