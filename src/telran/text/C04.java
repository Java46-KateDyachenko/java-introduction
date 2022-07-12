package telran.text;

public class C04 {
	public static boolean parseBrackets (String str) {
		char ar[]= new char[str.length()]; 
		int count=0;
		for (int i=0; i<str.length();i++) {
			if (str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='[') {
				ar[count]=str.charAt(i);
				count++;
		     	}
			if (str.charAt(i)=='}'||str.charAt(i)==')'||str.charAt(i)==']') {
				if (count>0) { //check if the close bracket not at the first position
					switch (str.charAt(i)) {//check if the close bracket has previous open bracket
					case '}':
						if (ar[count-1]=='{') {
						ar[count-1]=' ';
						count--;
						}else return false;
						
						break;
					case ']':
						if (ar[count-1]=='[') {
							ar[count-1]=' ';
							count--;
							}else return false;
						break;
					case ')':
						if (ar[count-1]=='(') {
							ar[count-1]=' ';
							count--;
							}else return false;
						break;
					}
			   
				}
				else return false;
			}
		}
		
		if (count==0) {return true;}
		else return false;
	}

}
