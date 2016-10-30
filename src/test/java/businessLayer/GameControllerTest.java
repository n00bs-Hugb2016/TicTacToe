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

}