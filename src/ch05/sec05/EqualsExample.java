package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {

		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) { // true
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {

			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) { // true
			System.out.println("strVar1과 strVar2는 문자열 같음");
		}
		System.out.println();
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if (strVar3 == strVar4) { // false
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {

			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if (strVar3.equals(strVar4)) { // true
			System.out.println("strVar3과 strVar4는 문자열 같음");
		}

	}
}
