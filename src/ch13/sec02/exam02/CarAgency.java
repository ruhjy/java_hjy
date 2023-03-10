package ch13.sec02.exam02;

//타입 파라미터 P를 Car으로 대체
public class CarAgency implements Rentable<Car> {

	// 리턴 타입이 반드시 Car이어야 함.
	@Override
	public Car rent() {
		return new Car();
	}
}
