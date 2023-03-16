package ch15.lecture.p07treeset;

import java.util.*;

public class C01TreeSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();

		set.add(3000);
		treeSet.add(3000);
		set.add(20);
		treeSet.add(20);
		set.add(20000);
		treeSet.add(20000);
		set.add(20);
		treeSet.add(20);

		System.out.println(set);
		System.out.println(treeSet);

	}
}
