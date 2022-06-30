package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.TictactoeGame;

class TictactoeTests {

@Test
	void testTictacToeColumn() {
		
		char matrix[][]= {
				{'x',1,1},
				{'x',1,1},
				{1,1,1}
		};
		assertEquals(1,TictactoeGame.tictactoeMove(matrix, 2, 0, 'x'));
		assertEquals(0,TictactoeGame.tictactoeMove(matrix, 2, 0, '0'));
	}
	
	
	@Test
	void testTictacToeRaw() {
		
		char matrix[][]= {
				{'x','x',1},
				{1,1,1},
				{1,1,1}
		};
		assertEquals(1,TictactoeGame.tictactoeMove(matrix, 0, 2, 'x'));
		assertEquals(0,TictactoeGame.tictactoeMove(matrix, 0, 2, '0'));
	}
	@Test
		void testTictacToeDiagonal() {
			
		char matrix1[][]= {
				{1,1,1},
				{1,'x',1},
				{1,1,'x'}
		};
		char matrix2[][]= {
				{1,1,'x'},
				{1,1,1},
				{'x',1,1}
		};
		
		
		assertEquals(1,TictactoeGame.tictactoeMove(matrix1, 0, 0, 'x'));
		assertEquals(0,TictactoeGame.tictactoeMove(matrix1, 0, 0, '0'));
		
		assertEquals(1,TictactoeGame.tictactoeMove(matrix2, 1, 1, 'x'));
		assertEquals(0,TictactoeGame.tictactoeMove(matrix2, 1, 1, '0'));
	} 
	
@Test
void testTictacToeFull() {
	
	char matrix1[][]= {
			{'x','x',1},
			{'0','0','x'},
			{'x','0','0'}
	};
	char matrix2[][]= {
			{'x',1,1},
			{0,0,0},
			{0,0,0}
	};
	assertEquals(2,TictactoeGame.tictactoeMove(matrix1, 0, 2, '0'));
	assertEquals(0,TictactoeGame.tictactoeMove(matrix2, 0, 2, 'x'));
}


}
