package entityClasses;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest
{
    public static void main(String args[])
    {
        org.junit.runner.JUnitCore.main("entityClasses");
    }

    @Test
    public void testgetMoves1 ()
    {
        Player p = new Player('X');
        assertEquals(1, p.getMoves());
    }
}
