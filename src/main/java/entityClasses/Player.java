package entityClasses;

/**
 * This is an entity class, representing a player.
 */

public class Player
{
    private int movesMade;
    private int wins;
    private char sign;
     
    public Player(char playerSign) 
    {
        sign = playerSign;
        movesMade = 0;
        wins = 0;
    }
    
    /**
     * Returns the number of moves made by this player.
     * @return    the number of moves made
     * @see       int
     */
    public int getMoves ()
    {
        return movesMade;
    }

    /**
     * Returns this players sign.
     * @return    this player's sign
     * @see       char
     */
    public char getSign()
    {
        return sign;
    }

    /**
     * Makes a move on the board if it is leagal.
     * @param    board    the game board
     * @param    x        the x position
     * @param    y        the y position
     */
    public void makeMove(Board board, int x, int y) 
    {
        if (board.getPositionChar(x, y) == ' ') 
        {
            movesMade++;

            board.setPositionChar(x, y, sign);
        }
    }
}
