package ch06.lecture.p07constructor;

public class C08Constructor {
	public static void main(String[] args) {

		MyClass08 o1 = new MyClass08("son", 33, "01-02", false);
		MyClass08 o2 = new MyClass08("park", 55, null, false);
		o2.birthDate = "02-03";

		MyClass08 o3 = new MyClass08("cha", 77, false);
		o3.birthDate = "03-04";

		MyClass08 o4 = new MyClass08(33, "heo");
		MyClass08 o5 = new MyClass08("heo", 33);
		
		System.out.println(o4);
		System.out.println(o5);
	}

}
