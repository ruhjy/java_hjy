package ch11.lecture.p05custom;

public class C02CustomException {
	public static void main(String[] args) throws Exception {

		Exception e = new Exception();
		Exception e2 = new Exception("some message");

		System.out.println(e.getMessage());
		System.out.println(e2.getMessage());

		throw e2;
	}
}
