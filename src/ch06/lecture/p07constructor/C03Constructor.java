package ch06.lecture.p07constructor;

public class C03Constructor {
	public static void main(String[] args) {

		MyClass03 o1 = new MyClass03();
		o1.name = "park";
		o1.age = 66;

		MyClass03 o2 = new MyClass03();
		o2.name = "cha";
		o2.age = 55;

		MyClass03 o3 = new MyClass03();

		o1.descript();
		o2.descript();
		o3.descript();

	}

}
