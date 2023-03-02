package ch06.lecture.p09package;

import static ch06.lecture.p09package.package1.MyClass05.*;

//import static ch06.lecture.p09package.package1.MyClass05.name;
//import static ch06.lecture.p09package.package1.MyClass05.method1;
//import static ch06.lecture.p09package.package1.MyClass05.method2;

public class C07StaticImportAll {
	public static void main(String[] args) {

		String n = name; // MyClass05.name;
		method1(); // MyClass05.method1();
		method2(); // MyClass05.method2();

	}
}
