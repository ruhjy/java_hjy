package ch07.lecture.p06final;

public class C03FinalMethod {

}

class Super03 {
	// final method
	// 하위클래스에서 재정의 할 수 없음
	public final void method1() {
	}

	public void method2() {
	}
}

class Sub03 extends Super03 {

	// Cannot override the final method from Super03
	@Override
	public void method1() { 
		System.out.println("재정의");
	}

}