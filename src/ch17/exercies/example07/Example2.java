package ch17.exercies.example07;

import java.util.*;
import java.util.stream.*;

import ch15.lecture.p02collections.*;

public class Example2 {
	public static void main(String[] args) {

		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자니어"),
				new Member("신용권", "개발자"));

		List<Member> developers = list.stream()
				.filter(member -> member.getJob().equals("개발자"))
				.toList();

		developers.stream().forEach(m -> System.out.println(m.getName()));
		System.out.println();
		
		Map<String, List<Member>> developers2 = list.stream()
//				.filter(member -> member.getJob().equals("개발자"))
//				.collect(Collectors.groupingBy(Member::getJob));
				.collect(Collectors.groupingBy(m -> m.getJob()));

		developers2.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
	}
}
