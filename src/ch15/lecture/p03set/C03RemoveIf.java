package ch15.lecture.p03set;

import java.util.*;

public class C03RemoveIf {
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("css");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		System.out.println(set);

		// removeIf() : 조건부 삭제
		// 글자 수가 짝수인 단어 삭제
		set.removeIf(e -> (e.length() % 2) == 0);
		System.out.println(set);

	}
}
