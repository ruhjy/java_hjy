package ch17.lecture.p03intermediate;

import java.util.*;

public class C06Peek {
	public static void main(String[] args) {

		(new Random()).ints(5)
				.peek(System.out::println) // peek : 최종연산 전에 결과 보기(디버깅)
				.forEach(System.out::println);

	}
}
