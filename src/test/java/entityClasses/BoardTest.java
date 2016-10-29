package entityClasses;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class BoardTest 
{
    public static void main(String args[]) 
    {
        org.junit.runner.JUnitCore.main("entityClasses");
    }

    @Test
    public void testGetBoard() 
    {
		Board b  = new Board();
		
		for(int i = 0; i < b.boardSize; i++)
		{
			for(int j = 0; j < b.boardSize; j++)
			{
				assertEquals(' ', b.boardArray[i][j]);
			}
		}
    }
	@Test
	public void testPlayerPosition()
	{
		Board b  = new Board();
		b.setPosition(1, 1, b.playerX);
		assertEquals('X', b.getPosition(1, 1));
	}
	@Test
	public void testWinner()
	{
		Board b = new Board();
		b.setPosition(0,0, b.playerX);
		b.setPosition(0,1, b.playerX);
		b.setPosition(0,2, b.playerX);
		assertEquals(true, b.checkBoardWinner(b.playerX));
		
		b.fillBoard();
		b.setPosition(0,1, b.playerX);
		b.setPosition(1,1, b.playerX);
		b.setPosition(2,1, b.playerX);
		assertEquals(true, b.checkBoardWinner(b.playerX));
		
		b.fillBoard();
		b.setPosition(0,0, b.playerO);
		b.setPosition(1,1, b.playerO);
		b.setPosition(2,2, b.playerO);
		assertEquals(true, b.checkBoardWinner(b.playerO));
	}

}

