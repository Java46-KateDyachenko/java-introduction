package telran.numbers;
import  java.lang.Math;
/**
 * 
 * @author User
 * application should print out 7 random numbers in the range [1-49]
 */
public class SportLotoAppl {
	public static void main(String[]args) {
		for (int i=0; i<7;i++) {
		 System.out.print (getRandomNumber(1,49)+" ");	
		 
		}
			
	}
	

	
private static int getRandomNumber(int min, int max) {
return (int) (min+Math.random()*(max-min+1));
}
}