package ch17.exercies.example07;

import java.util.*;
import java.util.stream.*;

public class Example3 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자니어"),
				new Member("신용권", "개발자"));

		List<Member> developers = list.stream()
				.filter(member -> member.getJob().equals("개발자"))
				.collect(Collectors.toList());

		developers.stream()
				.forEach(m -> System.out.println(m.getName()));

		System.out.println("-----------------------------------------");

		// 수정 불가능한 리스트
		List<Member> developers1 = list.stream()
				.filter(member -> member.getJob().equals("개발자"))
				.toList();

		// 수정 가능한 리스트 .collect() 사용
		List<Member> developers2 = list.stream()
				.filter(member -> member.getJob().equals("개발자"))
				.collect(Collectors.toList());

//		developers1.add(new Member("123", "123"));
//		developers1.remove(0);

//		developers2.add(new Member("123", "123"));
//		System.out.println(developers2);
		
		developers1.set(0, new Member("111", "!11"));
	}
}
