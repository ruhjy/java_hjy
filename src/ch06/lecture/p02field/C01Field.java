package ch06.lecture.p02field;

public class C01Field {
	public static void main(String[] args) {
		MyClass01 var1 = new MyClass01();
		
		// 도트(.) : 필드 접근 연산자
		var1.age = 99;
		var1.name = "son";
		var1.score = 100;
		
		System.out.println(var1.age); // 99
		System.out.println(var1.name); // "son"
		System.out.println(var1.score); // 100
		System.out.println();
		
		MyClass01 var2 = new MyClass01();
		
		var2.age = 88;
		var2.name = "cha";
		var2.score = 200;
		System.out.println(var2.age); // 88
		System.out.println(var2.name); // "cha"
		System.out.println(var2.score); // 200
	}
}
