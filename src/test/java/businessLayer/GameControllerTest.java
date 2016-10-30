package businessLayer;

import entityClasses.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class GameControllerTest {
    

	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("businessLayer");
        
	}

	@Test
	public void testClearBoard()
	{
		GameController game = new GameController();
		char[][] b = game.getBoard();

		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				b[i][j] = 'O';
			}
		}
		game.clearBoard();
		//if the board is truly empty/cleared it will return false
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				//check if each and every one of slots are empty or ' '
				assertEquals(' ', b[i][j]);
			}
		}		
	}
	
	@Test
	public void testSwitchingPlayers()
	{
		GameController game = new GameController("X", "Y");
		game.switchPlayer();
		assertEquals('O', game.getCurrentPlayer().getSign());
	}

	@Test
	public void testCheckStatus()
	{
		GameController game = new GameController("X", "Y");
		char [][] b = game.getBoard();
		b[0][0] = 'X';
		b[1][1] = 'X';
		b[2][2] = 'X';
		assertEquals(1, game.checkStatus());
		b[0][0] = 'X';
		b[0][1] = 'O';
		b[0][2] = 'X';
		b[1][0] = 'O';
		b[1][1] = 'O';
		b[1][2] = 'X';
		b[2][0] = 'X';
		b[2][1] = 'X';
		b[2][2] = 'O';
		assertEquals(2, game.checkStatus());
		b[0][0] = 'X';
		b[0][1] = 'O';
		b[0][2] = 'X';
		b[1][0] = ' ';
		b[1][1] = ' ';
		b[1][2] = ' ';
		b[2][0] = ' ';
		b[2][1] = ' ';
		b[2][2] = ' ';
		assertEquals(0, game.checkStatus());
	}

	@Test
	public void testMakeMove()
	{
		GameController game = new GameController("X", "Y");
		char [][] b = game.getBoard();
		assertEquals(true, game.makeMove(0, 0));
		assertEquals(false, game.makeMove(0, 0)); //move has already been made to 0,0
		assertEquals(false, game.makeMove(3, -5));
		assertEquals(false, game.makeMove(1, 5));
		assertEquals(false, game.makeMove(10, 1));
	}
}