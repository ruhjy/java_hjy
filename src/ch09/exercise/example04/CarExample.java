package ch09.exercise.example04;

public class CarExample {
	public static void main(String[] args) {

		Car car = new Car();

		Car.Tire tire = car.new Tire();

		Car.Engine engine = new Car.Engine();
	}
}
