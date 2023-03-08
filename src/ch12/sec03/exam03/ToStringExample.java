package ch12.sec03.exam03;

public class ToStringExample {
	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

		String strObj = myPhone.toString();
		System.out.println(strObj); // toString() 메서드 호출

		System.out.println(myPhone); // toString() 메서드 호출

	}
}
