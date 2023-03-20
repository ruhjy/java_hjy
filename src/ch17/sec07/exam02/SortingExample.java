package ch17.sec07.exam02;

import java.util.*;

public class SortingExample {
	public static void main(String[] args) {

		// List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("신용권", 10));
		studentList.add(new Student("유미선", 20));

		// 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream()
//				.sorted((s1, s2) -> s1.getScore() - s2.getScore())
				.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
				.forEach(System.out::println);
		System.out.println();

		// 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
//				.sorted((s1, s2) -> s2.getScore() - s1.getScore())
				.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
				.forEach(System.out::println);
		System.out.println();

		// 이름순
		studentList.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
				.forEach(System.out::println);
	}
}
