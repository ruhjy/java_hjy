package ch13.exercise.example03;

public class ContainerExample {
	public static void main(String[] args) {

		Container<String, String> container1 = new Container<>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println("이름 : " + name1 + ", 직업 : " + job);

		Container<String, Integer> container2 = new Container<>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println("이름 : " + name2 + ", 나이 : " + age);
	}
}
