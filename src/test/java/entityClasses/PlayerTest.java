package entityClasses;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest
{
    Player p = new Player('X', "Jon");

    public static void main(String args[])
    {
        org.junit.runner.JUnitCore.main("entityClasses");
    }

    @Test
    public void testGetMoves()
    {
        assertEquals(0, p.getMoves());
    }

    @Test
    public void testGetSign()
    {
        assertEquals('X', p.getSign());
    }
    @Test
    public void testName()
    {
        assertEquals("Jon", p.getName());
    }

}
