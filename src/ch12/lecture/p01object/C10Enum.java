package ch12.lecture.p01object;

public class C10Enum {
	public static void main(String[] args) {

		System.out.println(MyClass10.SPRING);
		System.out.println(MyClass10.SUMMER);
		System.out.println(MyClass10.FALL);
		System.out.println(MyClass10.WINTER);

	}
}

class MyClass10 {

	public static final int SPRING = 1;
	public static final int SUMMER = 2;
	public static final int FALL = 3;
	public static final int WINTER = 4;

}
