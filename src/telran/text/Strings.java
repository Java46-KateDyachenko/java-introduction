package telran.text;

	public class Strings {
		/**
		 * 
		 * @param str1 ascii string with no repeated symbols
		 * @param str2 ascii string with no repeated symbols
		 * @return array with two numbers
		 * first - number of the symbols of the str1 that exist in str 2 at the same indexes 
		 * second - number of the symbols of the str1 that exist in str 2 at differ indexes
		 */
	public static int[] deepNoRepeatedCompare (String str1,String str2){
		//Two implementations
		//first: additional helper array such array['a'] 
		// is an index of the symbol 'a' or -1
		//
		// example, str1-"ctab" then array['a'] =2;
		//******************************************
		//second: implementation based on the method indexOf
		char ar1[]=str1.toCharArray();
		char ar2[]=str2.toCharArray();
		int res[]=  {0,0};
		int res1=0;
		int res2=0;
		for (int i=0; i<str1.length();i++) {
			if ((i<str2.length())&&(ar1[i]==ar2[i])) {
			res1++;}
			else
			{			
		    if (str2.indexOf(ar1[i])>-1)
		    {res2++;}
			}
			
		}
		res[0]=res1;
		res[1]=res2;
		
		return res;
	}
	/**
	 * 
	 * @param str1 English letters(may have repeats)
	 * @param str2  English letters(may have repeats)
	 * @return true if:
	 * (1)str2 has the same as str1 length
	 *(2)str2 comprises of all letters from str1
	 **/
	public static boolean isAnagram(String str1, String str2) {
	// additional helper array such that array['a'] is the number of 'a' occurences in str1
	// str1="hello", array['l']=2; array['w'=0;]
		boolean res=false;
		if (str1.length()==str2.length()) {
		char ar1[]=str1.toCharArray();
		
		String str_res=new String(str2);
		
		int i=0;
		while (i<str1.length()&&str_res.indexOf(ar1[i])!=-1) {
			String str=str_res.substring(0, 0)+str_res.substring(1);
			str_res=str;
			i++;
		}
		if (str_res.length()==0) {res=true;}
	
		}
		return res;
		
	}
	}

