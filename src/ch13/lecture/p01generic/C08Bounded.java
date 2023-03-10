package ch13.lecture.p01generic;

public class C08Bounded {
	public static void main(String[] args) {
		MyClass08<Integer> o1 = new MyClass08<>(88);
		o1.handleItem();
		
		MyClass08<Double> o2 = new MyClass08<>(3.14);
		o2.handleItem();
		
		// String은 Number의 하위타입이 아님.
//		MyClass08<String> o3 = new MyClass08<>("java");
		
	}
}

// bounded type parameter
class MyClass08<T extends Number> {

	private T item;

	public MyClass08(T item) {
		this.item = item;
	}

	public void handleItem() {
		String str = item.toString();
		int hash = item.hashCode();
		boolean equals = item.equals(null);

		// item이 Number 또는 그 하위타입이므로 Number의 메서드를 실행할 수 있음
		int i = item.intValue();
		double d = item.doubleValue();

//		if (item instanceof Number numItem) {
//			int i = numItem.intValue();
//			double d = numItem.doubleValue();
//		}
	}

}
