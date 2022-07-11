package telran.text;


public class HW8 {



	/**
	 * 
	 * @return regular expression for arithmetic expression
	 * with no parentheses
	 * operand +,-,*,/ [/*+- ]
	 * operand either java variable or integer number or double number for example
	 * a ; __; 10; 10.2; 10.0
	 * assumption^ placing of parentheses is not considered
	 * a+(10*2)=> a+10*2
	 * a+((10)*)2=> a+10*2 according to assumption
	 * a+(-10*2)=>wrong
	 *  
	 */
	public static boolean isArithmeticExpression(String expr) {
		
		String res = expr.replaceAll("\\s+",""); // delete spaces 
	    
		int count =0;
		int i=0;
		while (i<res.length())
		 {
		switch(res.charAt(i)){    
			case '(': count++;
			           res=removeCharAt(res,i);
			           break;
			case ')': count--;
			           res=removeCharAt(res,i);
			           break;
			default:i++;
			 }	
		}
		
		if (count!=0) {return false;}
		else {
			return arithmeticExseption(res);
		
	           }
	}
	
	
	private static boolean arithmeticExseption(String str) {
	 
		return str.matches("((\\w|\\d+|\\d+\\.\\d+)[+,-,*,\\\\])+(\\w|\\d+\\.\\d+)");
	}


	private static String removeCharAt(String str, int index) {
		String res=""; 
		if (index==0) {res=str.substring(index+1);}
		 else {res=str.substring(0, index) + str.substring(index + 1);}
	return res;
		
	}

}
