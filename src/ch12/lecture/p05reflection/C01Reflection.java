package ch12.lecture.p05reflection;

public class C01Reflection {
	public static void main(String[] args) throws ClassNotFoundException {
		// reflection
		// 클래스에 관한 정보

		// 클래스정보를 가진 객체 생성
		// 1. 클래스의 .class 속성으로 얻기
		Class<String> class1 = String.class;
		Class<Integer> classI1 = Integer.class;

		// 2. forName static method로 얻기
		Class<String> class2 = (Class<String>) Class.forName("java.lang.String");

		// 3. 객체로 부터 얻기
		String s1 = "java";
		Class<String> class3 = (Class<String>) s1.getClass();

		System.out.println("class1 : " + class1);
		System.out.println("class2 : " + class2);
		System.out.println("class3 : " + class3);
		System.out.println("classI1 : " + classI1);
		System.out.println();
		
		System.out.println(System.identityHashCode(class1));
		System.out.println(System.identityHashCode(class2));
		System.out.println(System.identityHashCode(class3));
		System.out.println(System.identityHashCode(classI1));

	}
}
