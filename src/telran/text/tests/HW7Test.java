package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import telran.text.HW7;
import telran.text.Strings;

class HW7Test {

	@Test
	void sortString() {
		
		  String str1[]= {"0","0","0","0","0"};
		  String str2[]= {"0","23","23","11","6"};
		  String expected2[]= {"0","6","11","23","23"};
		
		  String[] res1= HW7.sortStringsAsNumbers(str1);
		  
		  for(int i=0; i<str1.length-1;i++) {
		  assertEquals(str1[i],res1[i]);
		  }	


		  String[] res2= HW7.sortStringsAsNumbers(str2);
		  for(int i=0; i<str2.length-1;i++) {
		  assertEquals(expected2[i],res2[i]);
		  }	
	}
@Test
void matchTest() {
	
	assertEquals(HW7.YES_MATCH,HW7.matches("David", "david"));
	assertEquals(HW7.YES_MATCH,HW7.matches("John F", "John Fitzgerald"));
	assertEquals(HW7.NO_MATCH,HW7.matches("John K", "John Fitzgerald"));
	
 	assertEquals(HW7.YES_MATCH,HW7.matches("Anna Maria Magdalena", "Anna Magdalena"));
    assertEquals(HW7.NO_MATCH,HW7.matches("Anna Maria Magdalena", "Anna Maria Roberta"));
	assertEquals(HW7.NO_MATCH,HW7.matches("Anna Maria Magdalena", "Anna Magdalena Roberta"));
    assertEquals(HW7.NO_MATCH,HW7.matches("Anna Maria Magdalena", "Anna Magdalena Maria"));
    
    assertEquals(HW7.YES_MATCH,HW7.matches("Anna Maria Robertha Magdalena", "Anna Robertha Magdalena"));
    assertEquals(HW7.NO_MATCH,HW7.matches("Anna Maria Robertha Magdalena", "Anna Robertha Frederica Magdalena"));
    assertEquals(HW7.YES_MATCH,HW7.matches("Anna Maria Robertha", "Anna Maria"));
    


}
}
