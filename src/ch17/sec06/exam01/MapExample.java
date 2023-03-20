package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {

		// List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));

		// Student를 score 스트림으로 변환
		studentList.stream()
				.mapToInt(s -> s.getScore())
				.forEach(score -> System.out.println(score));
		System.out.println();

		// mapToInt(s -> s.getScore()) -> mapToInt(Student::getScore)
		// 최대점수
		int max = studentList.stream()
				.mapToInt(s -> s.getScore()).max().getAsInt();
		System.out.println("max : " + max);
		// 최소점수
		int min = studentList.stream()
				.mapToInt(s -> s.getScore()).min().getAsInt();
		System.out.println("min : " + min);
		// 총합
		int sum = studentList.stream()
				.mapToInt(s -> s.getScore()).sum();
		System.out.println("sum : " + sum);
		// 평균
		double avg = studentList.stream()
				.mapToInt(s -> s.getScore()).average().getAsDouble();
		System.out.println("avg : " + avg);

		System.out.println("\nIntSummaryStatistics 사용");
		IntSummaryStatistics summary = studentList.stream()
				.mapToInt(Student::getScore)
				.summaryStatistics();
		int max2 = summary.getMax();
		System.out.println("max2 : " + max2);
		int min2 = summary.getMin();
		System.out.println("min2 : " + min2);
		long sum2 = summary.getSum();
		System.out.println("sum2 : " + sum2);
		double avg2 = summary.getAverage();
		System.out.println("avg2 : " + avg2);

//		System.out.println(summaryStatistics.toString());

	}
}
