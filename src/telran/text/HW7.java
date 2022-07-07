package telran.text;

import org.hamcrest.core.IsEqual;

public class HW7 {
	private static final int MIN_NUM = 0;
	private static final int MAX_NUM = 999;
	public static final String YES_MATCH = "match";
	public static final String NO_MATCH = "no_match";

	/**
	 * 
	 * @param name1 first name
	 * @param name2 second name
	 * @return either "match" or "no match"
	 */
	

	
	static public String matches(String name1, String name2) {
	       String ar1[]=name1.split(" ");
	       String ar2[]=name2.split(" ");
	    //   String res_ar[]=new String[ar1.length];
	       
	       int i1=0;
    	   int i2=0;
	       String res = YES_MATCH;
	       
	       if (name1.equalsIgnoreCase(name2)){
	    	   res=YES_MATCH;
	    	   
	       }
	       else {
	    	 
	           res=NO_MATCH;	   
	           while(i1<ar1.length && i2<ar2.length ) {
	                    if ((ar1[i1].equalsIgnoreCase(ar2[i2])|| (ar2[i2].length()==1 && ar1[i1].startsWith(ar2[i2]))) || (ar1[i1].length()==1 && ar2[i2].startsWith(ar1[i1])) ){
	    	            i1++;
	    	            i2++;
	    	            res=YES_MATCH;	
	                     }
	                    else {
	    	              i1++;
	    	               res=NO_MATCH;
	                       }
	    		   
	    	 }
	         if (i2<ar2.length) {res=NO_MATCH;}   
	       }
	       	     
		   return res;
		}
	
	
	
	/**
	 * sort array of strings
	 * @param strNumbers array of strings containing the integer numbers
	 * length of each string can not more than three symbols
	 * String containing "123" should be greater that string containing "23" as the number 23
	 * number 23
	 */
	static public String[] sortStringsAsNumbers(String[] strNumbers) {
		String res[]= new String[strNumbers.length];
		int help[]= new int [MAX_NUM];
		int num =0;
		for (int i=0;i<strNumbers.length;i++) {
			num=Integer.valueOf(strNumbers[i]);
			help[num]=++help[num];
		}
		int ch=0;
		for (int i=MIN_NUM;i<MAX_NUM;i++) {
			if (help[i]>0) {
			for (int j=0; j<help[i];j++) {
				res[ch]=String.valueOf(i);
				ch++;		
			}
			}
		}
		return res;
		//Algorithm complexity should be O[N]
		//Implementation hint: additional helper array such that ar[10] - count of occurences
	    // of number 10 in the given array
		//find out how to get number from string and how to convert number to string
	}

}
