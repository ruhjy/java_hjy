package ch07.exercise.example07;

public class Parent {

	public String nation;

	public Parent() {
		this("대한민국");
		System.out.println("Parent() 생성자 call");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) 생성자 call");
	}
}
