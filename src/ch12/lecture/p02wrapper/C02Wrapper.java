package ch12.lecture.p02wrapper;

public class C02Wrapper {
	public static void main(String[] args) {

		int i1 = 3;

		Integer o1 = i1; // 현재 버전 (auto boxing)
		Integer o2 = new Integer(i1); // 예전 버전 (포장, boxing)
		Integer o3 = Integer.valueOf(i1); // 지금 버전 (포장, boxing) (권장)

		Number o4 = i1; // auto boxing, 자동 형변환
		Object o5 = i1; // auto boxing, 자동 형변환

	}
}
