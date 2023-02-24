package ch05.sec09;

import java.util.Arrays;

public class ArraysCopyOfExample {
	public static void main(String[] args) {

		// Arrays.copyOf()

		// 길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		// 배열 항목 복사
		// newStrArray = oldStrArray를 oldStrArray 배열에 길이만큼 복사
		String[] newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length);
		// 배열 항목 출력
		for (String s : newStrArray) {
			System.out.print(s + ", ");
			// java, array, copy,
		}
	}

}
