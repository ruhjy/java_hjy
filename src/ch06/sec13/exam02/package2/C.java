package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.*;

// class A와 다른 패키지
public class C {

	// 필드 선언
	A a1 = new A(true); // o
//	A a2 = new A(1); // x - default 생성자 접근 불가
//	A a3 = new A("문자열"); // x - private 생성자 접근 불가
}
