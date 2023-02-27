package ch06.lecture.p03method;

public class MyClass05 {

	void method1() {
		// 실행코드
		System.out.println("파라미터 없는 메서드");
	}

	void method2(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	void method3(int line) {
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void method4(int param) {
		int var;
		var = 3;
		
		int p = param;
		p = 3; // 파라미터 값을 받고 싶으면 변수 새로 만들어서 담기

		System.out.println(param * var);
	}

}