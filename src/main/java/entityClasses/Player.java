package entityClasses;

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
    
    public int getMoves ()
    {
        return movesMade;
    }

    public char getSign()
    {
        return sign;
    }
}
