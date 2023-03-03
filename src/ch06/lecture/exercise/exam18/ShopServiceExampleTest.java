package ch06.lecture.exercise.exam18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class ShopServiceExampleTest {

	@Test
	void test() {
		
		ShopService s1 = ShopService.getInstance();
		ShopService s2 = ShopService.getInstance();
		
		Assertions.assertSame(s1, s2);
	}

}
