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
		
		for(int i = 0; i < b.getSize(); i++)
		{
			for(int j = 0; j < b.getSize(); j++)
			{
				assertEquals(' ', b.getPositionChar(i,j));
			}
		}
    }
	@Test
	public void testPlayerPosition()
	{
		Board b  = new Board();
		b.setPositionChar(1, 1, b.getPlayer('X'));
		assertEquals('X', b.getPositionChar(1, 1));
	}
	@Test
	public void testWinner()
	{
		Board b = new Board();
		b.setPositionChar(0,0, b.getPlayer('X'));
		b.setPositionChar(0,1, b.getPlayer('X'));
		b.setPositionChar(0,2, b.getPlayer('X'));
		assertEquals(true, b.checkBoardWinner(b.getPlayer('X')));
		
		b.fillBoard();
		b.setPositionChar(0,1, b.getPlayer('X'));
		b.setPositionChar(1,1, b.getPlayer('X'));
		b.setPositionChar(2,1, b.getPlayer('X'));
		assertEquals(true, b.checkBoardWinner(b.getPlayer('X')));
		
		b.fillBoard();
		b.setPositionChar(0,0, b.getPlayer('O'));
		b.setPositionChar(1,1, b.getPlayer('O'));
		b.setPositionChar(2,2, b.getPlayer('O'));
		assertEquals(true, b.checkBoardWinner(b.getPlayer('O')));
	}
	@Test
	public void testFullBoard()
	{
		Board b = new Board();
		assertEquals(false, b.checkFullBoard());
		
		for(int i = 0; i < b.getSize(); i++)
		{
			b.setPositionChar(i, 0, b.getPlayer('O'));
		}
		
		assertEquals(false, b.checkFullBoard());
		
		for(int i = 0; i < b.getSize(); i++)
		{
			for(int j = 0; j < b.getSize(); j++)
			{
				b.setPositionChar(i, j, b.getPlayer('X'));
			}			
		}
		assertEquals(true, b.checkFullBoard());
	}

	@Test
	public void testOccupied()
	{
		Board b = new Board();
		//testing empty board to see if empty place on certain position
		//for testing comment
		assertEquals(false, b.isOccupied(0, 0));

		b.setPositionChar(0,0, 'O');
		//if position is occupied a true should return
		assertEquals(false, b.isOccupied(0,0));
	}

}

