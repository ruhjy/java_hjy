package ch06.lecture.p03method;

public class C01Method {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();

		// 메서드 호출(실행) call, invoke, execute
		o1.run();
		o1.standUp();
		o1.wakeUp();
		o1.methodName(0);

		MyClass01 o2 = new MyClass01();
		o2.run();
		o2.standUp();
		o2.wakeUp();
		o2.methodName(0);

	}
}
