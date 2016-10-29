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
		Board b = game.getBoard();
		for(int i = 0; i < b.getSize(); i++)
		{
			for(int j = 0; j < b.getSize(); j++)
			{
				b.setPositionChar(i, j, 'O');
			}
		}
		game.clearBoard();
		//if the board is truly empty/cleared it will return false
		
		for(int i = 0; i < b.getSize(); i++)
		{
			for(int j = 0; j < b.getSize(); j++)
			{
				assertEquals(' ', b.getPositionChar(i,j));
			}
		}
		
	}

}