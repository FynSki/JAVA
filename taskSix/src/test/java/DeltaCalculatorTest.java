import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeltaCalculatorTest {

	@Test
	void deltaCal() {
		DeltaCalculator deCal = new DeltaCalculator();
		double a = 2;
		double b = 2;
		double c = -12;
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		assertEquals(100 , delta);
	}

	@Test
	void deltaLess() {
	}

	@Test
	void deltaMore1() {
	}

	@Test
	void deltaMore2() {
	}

	@Test
	void deltaEqual() {
	}

	@Test
	void convertToDouble() {
	}
}