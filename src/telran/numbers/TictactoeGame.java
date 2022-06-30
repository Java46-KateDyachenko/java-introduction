package telran.numbers;

import java.util.Arrays;

public class TictactoeGame {
	/**
	 * 
	 * @param matrix square matrix ()
	 * @param nRow
	 * @param nColumn
	 * @param symb('x'or '0')
	 * @return 0 - game isn't over; 1- game is over with the winner's move; 2- game is over
	 */

	
public static int tictactoeMove(char matrix[][],int nRow,int nColumn,char symb) {
	int game = 0;
    char[][] matrix_res =matrix;
    matrix_res[nRow][nColumn]=symb;
    
	if (matrixFull(matrix_res)==true) {
		game=2;
		}
	
	if ( (ifColumn(matrix_res)==true)||(ifRow(matrix_res)==true) ) {
		game=1;}
	if ( ifDiagonal(matrix_res)==true ) {
		game=1;}
	
	
	return game;
}

	private static boolean ifDiagonal(char[][] matrix) {
		int matrix_size=matrix.length;

		char res0[]= new char[matrix_size];
		char resX[]= new char[matrix_size];
		char diag1[]= new char[matrix_size];
		char diag2[]= new char[matrix_size];

	for(int i=0; i<matrix_size;i++) {
		 res0[i]= '0';
		 resX[i]= 'x';
		 diag1[i]=matrix[i][i];
		 diag2[i]=matrix[i][matrix_size-i-1];
		 }
	boolean res=false;
	
       if (Arrays.equals(diag1, res0) ||Arrays.equals(diag1, resX)||Arrays.equals(diag2, res0) ||Arrays.equals(diag2, resX)) {
                  res=true;
	    		   };
	
			

		return res;
	}


	private static boolean ifRow(char[][] matrix_check) {
		
		int matrix_size=matrix_check.length;

		char res0[]= new char[matrix_size];
		char resX[]= new char[matrix_size];

	for(int i=0; i<matrix_size;i++) {
		 res0[i]= '0';
		 resX[i]= 'x';}
	boolean res=false; 
	for(int i=0; i<matrix_size; i++) {
	       if (Arrays.equals(matrix_check[i], res0) ||Arrays.equals(matrix_check[i], resX)) {
                  res=true;
	              break;
	    		   };
	}
			

		return res;
	}

	private static boolean ifColumn(char[][] matrix_check) {
		
		
		int matrix_size=matrix_check.length;

		char res0[]= new char[matrix_size];
		char resX[]= new char[matrix_size];

	for(int i=0; i<matrix_size;i++) {
		 res0[i]= '0';
		 resX[i]= 'x';}
	boolean res=false; 
	
	
	for(int i=0; i<matrix_size; i++) {
	       if (Arrays.equals(column_matrix( matrix_check,i), res0) ||Arrays.equals(column_matrix(matrix_check,i), resX)) {
                  res=true;
	              break;
	    		   };
	}
			
		return res;
	}
	
	private static char[] column_matrix(char[][] matrix, int column_number) {
		char res[]= new char[matrix.length];

		for(int i=0; i<matrix.length; i++) {
			res[i]=matrix[i][column_number];
		}
		return res;
	}

	private static boolean matrixFull(char[][] matrix) {
		boolean res=true;
		
		for(int i=0; i<matrix.length;i++) {
			if (res==false) {break;}
			else {
			for(int j=0;j<matrix.length;j++) {
				if ((matrix[i][j]!='x')&&(matrix[i][j]!='0')) {
					res=false;
					break;
				}
			}
	
		         }
		}
		return res;
	}
}
