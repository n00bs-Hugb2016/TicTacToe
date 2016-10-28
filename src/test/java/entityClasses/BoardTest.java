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
		assertArrayEquals(new char[3][3], b.getBoard());
    }
}

