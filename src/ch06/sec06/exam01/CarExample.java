package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();

		// Car 객체의 필드값 얻기
		System.out.println("모델명: " + myCar.model); // null
		System.out.println("시동여부: " + myCar.start); // false
		System.out.println("현재속도: " + myCar.speed); // 0
		System.out.println();

		Car yourCar = new Car();
		System.out.println("모델명: " + yourCar.model); // null
		System.out.println("시동여부: " + yourCar.start); // false
		System.out.println("현재속도: " + yourCar.speed); // 0
		System.out.println();

		myCar.speed = 100;
		System.out.println(myCar.speed); // 100
		System.out.println(yourCar.speed); // 0
		System.out.println();

		Car hisCar = yourCar;
		yourCar.speed = 50;
		System.out.println(yourCar.speed); // 50
		System.out.println(hisCar.speed); // 50
		System.out.println();

		System.out.println(hisCar == yourCar); // true
		System.out.println(System.identityHashCode(myCar)); // 1651191114
		System.out.println(System.identityHashCode(yourCar)); // 1586600255
		System.out.println(System.identityHashCode(hisCar)); // 1586600255
	}
}
