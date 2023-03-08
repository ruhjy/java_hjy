package ch12.lecture.p01object;

import java.util.*;

public class C01Object {

	// Object
	// 모든 클래스의 상위 클래스

	public static void main(String[] args) {

		String s1 = "java";
		Object o1 = s1;

		Scanner sc = new Scanner("");
		Object o2 = sc;

		ArrayList list = new ArrayList();
		Object o3 = list;

		C01Object o4 = new C01Object();
		Object o5 = o4;

		Object o6 = new MyClass01();

		int i = 3;

		Object o7 = i; // 나중에..

	}
}

// extends Object 생략됨
class MyClass01 extends Object {

}
