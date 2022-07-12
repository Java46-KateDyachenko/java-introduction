package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static telran.text.C04.*;

class C04Test {

	@Test
	void parseBracketsTest() {
		
		assertTrue(parseBrackets("(2+3+[5+6+7+{8}+9]+0)"));
		assertTrue(parseBrackets("(2+3)+(5+6)+7+{8}+9+(0)"));
		assertTrue(parseBrackets("2+3"));
		assertTrue(parseBrackets("((((((2+3))))))"));
		
		
		assertFalse(parseBrackets(")2+3+[5+6+7+{8}+9]+0("));
		assertFalse(parseBrackets("(2+3+[5+6}+7+{8}+9]+0)"));
		assertFalse(parseBrackets("(2+3+[5+6+7+8+9]+0"));
		assertFalse(parseBrackets("2+3+[5+6+7+8+9]+0)"));
	}

}
