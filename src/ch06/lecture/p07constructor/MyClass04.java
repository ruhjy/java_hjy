package ch06.lecture.p07constructor;

public class MyClass04 {
	String model;
	int price;

	MyClass04(String model, int price) {
		this.model = model;
		this.price = price;
	}

	void desc() {
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
	}
}
