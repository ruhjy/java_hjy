package ch15.lecture.p06stack;

import java.util.*;

public class C01Stack {
	public static void main(String[] args) {

		// LIFO(last in first out), 후입선출, Stack
		// 주요 메서드
		// push : 새 아이템 추가
		// pop : 아이템 꺼내기(삭제)

		Stack<String> stack = new Stack<>();

		stack.push("1.backho");
		stack.push("2.chisoo");
		stack.push("3.taesup");
		stack.push("4.daeman");
		stack.push("5.taewoong");

		System.out.println("size : " + stack.size());

		String pop = stack.pop();
		System.out.println("pop : " + pop);
		System.out.println("size : " + stack.size());

		while (stack.size() > 0) {
			System.out.println("pop : " + stack.pop());
		}

	}
}
