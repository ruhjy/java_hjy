package ch15.sec06.exam01;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		// Stack 컬렉션 생성
		Stack<Coin> stack = new Stack<>();

		// 동전 넣기
		stack.push(new Coin(1, 100));
		stack.push(new Coin(2, 50));
		stack.push(new Coin(3, 500));
		stack.push(new Coin(4, 10));

		// 동전 하나씩 꺼내기
		while (!stack.empty()) { // 비어있지 않다면 반복
			Coin coin = stack.pop();
			System.out.println("꺼내온 동전 : " + coin.getOrder() + " - " + coin.getvalue() + "원");
		}
	}
}
