package ch16.lecture.p02lambda;

public class C02Lambda {
	public static void main(String[] args) {
		// 파라미터가 없으면 빈 ()
		// 메서드 body는 {}
		MyInterface02 o1 = () -> {
			System.out.println("메서드 body 작성");
		};
		o1.method();
		System.out.println();
		
		// 메서드의 명령문이 하나이면 중괄호 생략 가능
		MyInterface02 o2 = () -> { // 명령문이 두개여서 중괄호 생략 불가능
			System.out.println("명령문 여러개1");
			System.out.println("명령문 여러개2");
		};
		o2.method();
		System.out.println();

		// 생략가능하면 생략!
		// lambda는 생략할 수록 읽기 쉬움
		MyInterface02 o3 = () -> System.out.println("명령문 하나");
		o3.method();
	}
}

@FunctionalInterface
interface MyInterface02 {
	// 파라미터가 없는 추상 메서드
	void method();
}
