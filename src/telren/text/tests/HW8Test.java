package telren.text.tests;
import static telran.text.HW8.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HW8Test {

	@Test
	void isArithmeticTest() {
		assertTrue( isArithmeticExpression("(10*12)+6"));
		assertTrue( isArithmeticExpression("(a*(12))+6"));
		assertTrue( isArithmeticExpression("(_*(12))+6"));
		assertTrue( isArithmeticExpression("a+((10)*)2"));
		assertTrue( isArithmeticExpression("(10.01*122.12)+6"));
		
		assertFalse( isArithmeticExpression("(10)"));
		assertFalse( isArithmeticExpression("B"));
		assertFalse( isArithmeticExpression("(-10*12)+6"));
		assertFalse( isArithmeticExpression("(-10*12)+6"));
		assertFalse( isArithmeticExpression("(10*(12)+6"));
		assertFalse( isArithmeticExpression("(10*(12)+-6"));
		assertFalse( isArithmeticExpression("(10abb+6"));
		
		
		
		
	}

}
