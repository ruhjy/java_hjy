package ch17.exercies.example06;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {

		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26));

		System.out.println("for 사용 ####");
		int sum = 0;
		double avg = 0;

		for (Member member : list) {
			sum += member.getAge();
		}
		avg = sum / list.size();
		System.out.println("평균 나이 : " + avg);

		System.out.println("IntStream, average 사용 ####");
		double avg2 = list.stream()
				.mapToInt(Member::getAge)
				.average().orElseGet(() -> 0.0);
		System.out.println("평균 나이 : " + avg2);

		System.out.println("stream, collect 사용 ####");
		double avg3 = list.stream()
				.collect(Collectors.averagingDouble(Member::getAge));
		System.out.println("평균 나이 : " + avg3);
	}
}
