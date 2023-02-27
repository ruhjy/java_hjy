package ch06.lecture.p02field;

public class C03Field {
	public static void main(String[] args) {
		MyClass03 var1 = new MyClass03();
		MyClass03 var2 = new MyClass03();

		System.out.println(var1.name); // "kim"
		System.out.println(var1.height); // 0

		System.out.println(var2.name); // "kim"
		System.out.println(var2.height); // 0
		System.out.println();

		var1.name = "son";
		var1.height = 190;

		System.out.println(var1.name); // "son"
		System.out.println(var1.height); // 190

		System.out.println(var2.name); // "kim"
		System.out.println(var2.height); // 0

	}
}
