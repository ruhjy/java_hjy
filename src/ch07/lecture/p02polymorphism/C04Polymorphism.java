package ch07.lecture.p02polymorphism;

import java.util.*;

public class C04Polymorphism {
	public static void main(String[] args) {

		String s1 = "java";
		Scanner sc1 = new Scanner("");

		method1(s1);
		method1(sc1);

	}

	public static void method1(Object o) {
//		o.charAt(0);
//		o.nextLine();

		String s = o.toString();
		
		System.out.println(s);

	}
}
