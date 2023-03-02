package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.MyClass04;
//import ch06.lecture.p09package.package2.MyClass04; // import는 컴파일 에러

public class C04Import {
	public static void main(String[] args) {

		MyClass04 o1 = new MyClass04();

		ch06.lecture.p09package.package2.MyClass04 o2 = new ch06.lecture.p09package.package2.MyClass04();
	}
}
