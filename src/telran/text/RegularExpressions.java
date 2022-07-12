package telran.text;

public class RegularExpressions {

	public static String javaVariableRegex() {
		
		return "[a-zA-Z$][\\w$]*|_[\\w$]+";
	}
	public static String ipOctetRegex() {
		// string expression of number 0-255 with possible leading zeros
	// \\d ==[0-9] 
		return "\\d\\d?|[0,1]\\d\\d|2[0-4]\\d|25[0-5]|";
	}
	
	public static String ipV4Regex() {

		return String.format("((%s)\\.){3}(%s)",ipOctetRegex(),ipOctetRegex());
				//String.format("(($1%s)\\.){3}($1%s)",ipOctetRegex());
	}

	
}
