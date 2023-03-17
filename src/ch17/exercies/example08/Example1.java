package ch17.exercies.example08;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {

		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		Map<String, List<Member>> groupingMap = new HashMap<>();
		for (Member member : list) {
			List<Member> val = groupingMap.get(member.getJob());
			if (val == null) {
				val = new ArrayList<>();
				groupingMap.put(member.getJob(), val);
			}
			val.add(member);
		}

		System.out.println("[개발자]");
		List<Member> dev = groupingMap.get("개발자");
		for (Member d : dev) {
			System.out.println(d);
		}

		System.out.println("[디자이너]");
		List<Member> des = groupingMap.get("디자이너");
		for (Member d : des) {
			System.out.println(d);
		}

	}
}
