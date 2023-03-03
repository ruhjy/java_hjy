package ch06.lecture.p10access;

public class MyClass05 {

	private static MyClass05 ins;

	private MyClass05() {
	}

	public static MyClass05 getInstance() {
		if (ins == null)
			ins = new MyClass05();
		return ins;
	}
}
