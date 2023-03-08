package ch12.lecture.p01object;

import java.util.*;

public class C02Object {
	public static void main(String[] args) {
		// 따라서 Object에 있는 메서드는 모든 클래스가 가지고 있다.
		String s = "java";
		s.toString();
		s.hashCode();
		s.equals("");

		Scanner sc = new Scanner("");
		sc.toString();
		sc.hashCode();
		sc.equals(null);

		MyClass02 o1 = new MyClass02();
		o1.toString();
		o1.hashCode();
		o1.equals(null);

	}
}

class MyClass02 {

}