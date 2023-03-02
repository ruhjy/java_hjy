package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.MyClass05;

// static import
// : static 멤버(field, method)
//import static ch06.lecture.p09package.package1.MyClass05.*;
import static ch06.lecture.p09package.package1.MyClass05.name;
import static ch06.lecture.p09package.package1.MyClass05.method1;
import static ch06.lecture.p09package.package1.MyClass05.method2;

public class C05StaticImport {
	public static void main(String[] args) {

		String n = name; // MyClass05.name;

		System.out.println(n);
		method1(); // MyClass05.method1();
		method2(); // MyClass05.method2();
	}
}
