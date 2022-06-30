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


public static void sort(int[] ar) {

		int length=ar.length;
	do {
		moveMaxToEnd(ar,length);
		length--;
	}	while (ifSorted(ar)==false);	
	}
	//TODO
	//Improve algorithm with a proper moveMaxtoEnd method
	


private static boolean ifSorted(int[] ar) {
	
	boolean sorted = true;

	for (int i = 1; i < ar.length; i++) {
	    if (ar[i] > ar[i-1]) {
	        sorted = false;
	        break;
	    }
	}
return sorted;
}


private static void moveMaxToEnd(int[] ar,int length) 
{
	
//if (index<(ar.length))
//{
    
	for (int i=1; i<length; i++) {
		if (ar[i-1]>ar[i]) {
			swap(ar,i);
		}
	}
}
	//TODO
	//(1)improve algorithm of moveMaxToEnd: no compare of elements that
    // think of additional parameter of method with code update
	//(2) terminate algorithm once array is already sort(thing of returning some value with update)
	



private static void swap(int[] ar, int index) {
	int tmp = ar[index-1];
	ar[index-1]=ar[index];
	ar[index]=tmp;
}

/**
 * 
 * @param ar - sorted array
 * @param number
 * @return if the given number exists in the given array then returns the index of first occurency
 * otherwise returns negative value of (index+1) where index is the index 
 * at which the given number should have been;
 */

public static int binaryIndexOf(int[] ar, int number) {
	int left =0;
	int right= ar.length-1;
	int middle= ar.length/2;
	while(left<=right && ar[middle]!=number ) {
		if (ar[middle]<number) {
			left = middle+1;//looking for the number will be in right part of the array

		} else {
			right= middle -1; // looking for the number will be in the left part of the arrray
		}
		middle=(left+right)/2;
		
	}
	
//	return left > right ? -1 : middle ;
int res =left;
if (middle==ar.length) {
	res=middle;
}

while(res>1&&ar[res-1]==number) {
	res=res-1;
}
	
	
    return left > right ? -1*(res+1) :res ;
	
}

}


