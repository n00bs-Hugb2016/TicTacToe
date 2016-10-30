package entityClasses;

/**
 * This is an entity class, representing a single player.
 */

public class Player
{
    private int _movesMade;
    private int _wins;
    private char _sign;
    private String _name;
     
    public Player(char playerSign, String playerName) 
    {
        _sign = playerSign;
        _movesMade = 0;
        _wins = 0;
        _name = playerName;
    }
        
    /**
     * Returns the number of moves made by this player.
     * @return    the number of moves made
     */
    public int getMoves()
    {
        return _movesMade;
    }

     /**
     * Returns the name for this player.
     * @return    name of player
     */
    public String getName()
    {
        return _name;
    }
    
     /**
     * Set name a move to current player.
     */
    public void setName(String name) 
    {
        _name = name;
    }
    
    /**
     * Adds a move to current player.
     */
    public void addMove()
    {
        _movesMade++;
    }

    /**
     * Returns this players sign.
     * @return    this player's sign
     */
    public char getSign()
    {
        return _sign;
    }

     /**
     * Adds the wins for player.
     */
     public void addWins()
     {
        _wins++;
     }

     /**
     * Adds the wins for player.
     */
     public int getWins()
     {
        return _wins;
     }
}
