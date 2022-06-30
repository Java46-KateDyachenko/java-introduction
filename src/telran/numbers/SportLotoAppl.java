package telran.numbers;
import  java.lang.Math;
import java.util.Arrays;
/**
 * 
 * @author User
 * application should print out 7 random numbers in the range [1-49]
 */


public class SportLotoAppl {
	private static final int MAX_NUMBER=49; 
	private static final int N_NUMBERS=7; 
	
	public static void main(String[]args) {
	    int numbers[] = new int[N_NUMBERS];
	    int number = 0;
		for (int i=0; i<N_NUMBERS;i++) {
		    boolean check=true;
			while (check==true) {
			    number = getRandomNumber(1,MAX_NUMBER);
			    check = Arrays.asList(numbers).contains(number);
			    }
			
		numbers[i]=number;	
		System.out.print (numbers[i]+" ");	
		}
			
	}
	

	
private static int getRandomNumber(int min, int max) {
return (int) (min+Math.random()*(max-min+1));
}
}