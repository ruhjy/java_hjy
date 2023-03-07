package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.*;

public class OtherPackageClass {
	
	public void someMethod() {
		Super01 o1 = new Super01();
//		o1.method1(); // The method method1() from the type Super01 is not visible
	}
}
