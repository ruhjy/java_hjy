package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {

//		Phone phone = new Phone(); // 추상 클래스라서 생성 불가

		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
