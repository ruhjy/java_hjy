package ch16.lecture.p04type_inference;

import java.util.*;

public class C02TypeInference {
	// 지역변수만 가능
//	var field = 3; // xx

	public static void main(String[] args) {
		// 지역변수 타입 추론
		// var 사용조건
		// 선언과 동시에 초기화할 때만 사용 가능
		int a = 3;
		String b = "java";

		var c = 5;
		var d = "hello";

//		var e;
//		e = 9;

		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();
		var box3 = new Box<String>();

		var list1 = new ArrayList<List<String>>();

		// 재할당시 같은 타입만 가능
		var f = 10; // int로 추론
		f = 11; // ok
//		f = 3.14; // xx
//		f = "java"; // xx

		// var 사용시 읽기 쉬운 코드인가??
		var list2 = new ArrayList<String>();

		// 1억 줄...

		// String으로 추론 가능 ok
		for (String item : list2) {
		}

		// 권장하지 않음
		for (var item : list2) {
		}

		// var는 키워드가 아님
		int var = 3; // 사용 가능하지만 변수명으로 사용하지 말 것.
		
	}
}
