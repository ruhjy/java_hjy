package ch16.sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {

		Person person = new Person();

		Member m1 = person.getMember1(i -> new Member(i));
		System.out.println(m1);
		Member m2 = person.getMember1(Member::new);
		System.out.println(m2);
		System.out.println();

		Member m3 = person.getMember2((i, n) -> new Member(i, n));
		System.out.println(m3);
		Member m4 = person.getMember2(Member::new);
		System.out.println(m4);

	}
}
