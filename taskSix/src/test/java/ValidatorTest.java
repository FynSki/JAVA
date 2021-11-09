import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidatorTest {

	@Test
	void validator() {
		Validator valid = new Validator();
		String providedData = "1";
		double expected = 1.0;
		double result = valid.Validator(providedData);
		assertEquals(result , expected);
	}
}