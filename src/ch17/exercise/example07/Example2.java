package ch17.exercise.example07;

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

		list.stream()
				.filter(member -> member.getJob().equals("개발자"))
				.map(m -> m.getName())
				.forEach(System.out::println);
	}
}
