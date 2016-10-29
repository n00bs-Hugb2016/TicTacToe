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

    public void makeMove(Board board, int x, int y) 
    {
        if (board.getPositionChar(x, y) == ' ') 
        {
            movesMade++;

            board.setPositionChar(x, y, sign);
        }
    }
}
