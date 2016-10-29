pacage entityClasses;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest
{
    public static void main(Sting args[])
    {
        org.junit.runner.JUnitCore.main("entityClasses");
    }

    @Test
    public void testCount1 ()
    {
        Player p = new Player();
        assertEquals(1, p.count());
    }
}
