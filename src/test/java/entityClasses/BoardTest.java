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
		
		for(int i = 0; i < b.arrSize; i++)
		{
			for(int j = 0; j < b.arrSize; j++)
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
}

