package ch11.lecture.p02try_catch;

public class C04PrintStackTrace {
	public static void main(String[] args) {

		// unchecked exception
		try {
			String a = "java";
			System.out.println(a.charAt(4)); // unchecked exception
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// checked exception
		try {
			Class.forName("java.lang.String"); // checked exception
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
