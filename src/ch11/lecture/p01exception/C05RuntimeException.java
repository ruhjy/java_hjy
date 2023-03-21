package ch11.lecture.p01exception;

public class C05RuntimeException {
	public static void main(String[] args) {
		
		Object s = "java";
		
		Integer i = (Integer) s; // ClassCastException
		
		System.out.println("continue......");
	}
}
