package entityClasses;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest 
{
    public static void main(String args[]) 
    {
        org.junit.runner.JUnitCore.main("entityClasses.BoardTest");
    }

    @Test
    public void testGetBoard () 
    {
        assertArrayEquals(char[][] boardArray[3][3], Board.getBoard());
    }
}

