package ch16.lecture.p04type_inference;

import java.util.*;

public class C01TypeInference {
	// 타입 추론
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();

		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		List<List<Integer>> list2 = new ArrayList<>();

		
		MyInterface01 o1 = (int a, String b) -> b;
		MyInterface01 o2 = (a, b) -> b;
	}
}

interface MyInterface01 {
	String action(int a, String b);
}

class Box<T> {
	private T t;
}
