package ch16.lecture.p02lambda;

public class C05Lambda {
	public static void main(String[] args) {
		MyInterface05 o1 = new MyClass05();
		int r1 = o1.method();

		MyInterface05 o2 = () -> {
			System.out.println("람다로 메서드 재정의");
			return 3;
		};
		o2.method();

		MyInterface05 o3 = () -> {
			return 3;
		};
		int r2 = o3.method();
		System.out.println(r2);

		MyInterface05 o4 = () -> 5;
		System.out.println(o4.method());

	}
}

class MyClass05 implements MyInterface05 {

	@Override
	public int method() {
		System.out.println("명령문 작성..");
		return 0;
	}
}

@FunctionalInterface
interface MyInterface05 {
	int method();
}