package entityClasses;

/**
 * This is an entity class, representing a single player.
 */

public class Player
{
    private int movesMade;
    private int wins;
    private char sign;
    private String name;
     
    public Player(char playerSign) 
    {
        sign = playerSign;
        movesMade = 0;
        wins = 0;
    }
    
    /**
     * Returns the number of moves made by this player.
     * @return    the number of moves made
     */
    public int getMoves ()
    {
        return movesMade;
    }

     /**
     * Returns the name for this player.
     * @return    name of player
     */
    public String getName ()
    {
        return name;
    }

    /**
     * Returns this players sign.
     * @return    this player's sign
     */
    public char getSign()
    {
        return sign;
    }
}
