package ch16.lecture.p02lambda;

public class C04Lambda {
	public static void main(String[] args) {

		MyInterface04 o1 = new MyInterface04() {
			@Override
			public void method(int x, int y) {
				System.out.println("익명클래스");
				System.out.println(x + "," + y);
			}
		};
		o1.method(10, 20);
		System.out.println();

		MyInterface04 o2 = (int x, int y) -> {
			System.out.println("람다식");
			System.out.println(x + "," + y);
		};
		o2.method(30, 40);
		System.out.println();

		MyInterface04 o3 = (x, y) -> {
			System.out.println("파라미터 타입 생략");
			System.out.println(x + "," + y);
		};
		o3.method(50, 60);

		// 파라미터 한개일 때만 () 생략 가능
	}
}

@FunctionalInterface
interface MyInterface04 {
	void method(int x, int y);
}
