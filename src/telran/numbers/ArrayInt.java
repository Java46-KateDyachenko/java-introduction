package telran.numbers;
import java.util.Arrays;
import java.lang.System;
 

public class ArrayInt {

/*public static int[] addNumber(int ar[], int number) {
int res[] = new int[ar.length+1]; 
for (int i=0; i<ar.length; i++) {
	res [i] = ar[i];
              }
res[res.length-1]=number;
return res;
*/
public static int[] addNumber(int ar[], int number) {
	int res[] = Arrays.copyOf(ar,ar.length+1);
	res[res.length-1]=number;
	return res;

}


private static int[] copyOf(int[] ar, int i) {
	// TODO Auto-generated method stub
	return null;
}


public static int[] insertNumber(int ar[], int index, int number) {
	
	int res[] = new int [ar.length+1];
	System.arraycopy(ar, 0, res, 0, index);
	int arr1[] = {number};
 	System.arraycopy(arr1, 0, res, index, 1);
 	
 	System.arraycopy(ar, index, res, index+1, ar.length-index);
 	
	return res;
}




public static int[] removeNumber(int ar[], int index) {
	
	int res[] = new int [ar.length-1];
	System.arraycopy(ar, 0, res, 0, index);
	if (index<ar.length-1) {
	System.arraycopy(ar, index+1, res, index, ar.length-index-1);}
	return res;
}

/**
 * 
 * @param ar
 * @return if the given number exists in the given array then returns
 */

public static int indexOf(int ar[], int number) {
int res=-1;
for (int i=0; i<ar.length; i++) {
	if (ar[i]==number)
	{
		res=i;
		break;
	}
	
}
return res;
	
}

}


