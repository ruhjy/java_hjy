package ch08.sec12;

public class InstanceofExample {
	public static void main(String[] args) {

		// 구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		// ride() 메서드 호출 시 구현 객체를 매개값으로 전달
		ride(bus);
		System.out.println();

		ride(taxi);
	}

	public static void ride(Vehicle vehicle) {

		// 방법1
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}

		// 방법2 - java12부터 사용가능
//		if (vehicle instanceof Bus bus) {
//			bus.checkFare();
//		}

		vehicle.run();
	}
}
