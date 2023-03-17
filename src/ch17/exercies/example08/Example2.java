package ch17.exercies.example08;

import java.util.*;
import java.util.stream.*;

public class Example2 {
	public static void main(String[] args) {

		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		Map<String, List<Member>> groupingMap2 = list.stream()
				.collect(Collectors.groupingBy(
//						j -> j.getJob()
						Member::getJob));

		System.out.println("[개발자]");
		groupingMap2.get("개발자").stream().forEach(System.out::println);

		System.out.println("[디자이너]");
		groupingMap2.get("디자이너").stream().forEach(System.out::println);
	}
}
