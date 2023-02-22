package codetest.codingbat;

public class CommonEnd {
	public static void main(String[] args) {
		boolean b1 = commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3 });
		boolean b2 = commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3, 2 });
		boolean b3 = commonEnd(new int[] { 1, 2, 3 }, new int[] { 1, 3 });

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

	public static boolean commonEnd(int[] a, int[] b) {

		return ((a.length >= 1 && b.length >= 1) &&
				(a[0] == b[0] || a[a.length - 1] == b[b.length - 1]));

	}
}
