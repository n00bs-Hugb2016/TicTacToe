package businessLayer;

import entityClasses.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class GameControllerTest {
    
    GameController game = new GameController("Player X", "Player O");
    Board b = game.getBoard();

	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("businessLayer");
        
	}

	@Test
	public void testClearBoard()
	{
		
		
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
				//check if each and every one of slots are empty or ' '
				assertEquals(' ', game.getPositionChar(i,j));
			}
		}		
	}
    
    @Test
    public void testGetNameX()
    {
        assertEquals(game._playerX, game.getPlayerX());
    }
    
    @Test
    public void testGetNameO()
    {
        assertEquals(game._playerO, game.getPlayerO());
    }

}