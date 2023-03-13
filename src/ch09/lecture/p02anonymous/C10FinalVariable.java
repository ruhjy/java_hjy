package ch09.lecture.p02anonymous;

public class C10FinalVariable {

	int j;

	public void method1() {
		int i = 3; // effectively final
		j = 99; // ok
		j = 100; // ok
		class LocalClass {
			void method2() {
				System.out.println(i);
				System.out.println(j);
			}
		}
	}
}
