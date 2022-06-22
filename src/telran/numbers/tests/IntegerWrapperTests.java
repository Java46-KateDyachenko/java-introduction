package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntegerWrapperTests {

	@Test
	void expressioSmallNumbers() {
		Integer expression = 200/100+80;
		Integer expected = 82;
		assertTrue(expected==expression);
	}

}
