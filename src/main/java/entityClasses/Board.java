package entityClasses.Board;

public class Board
{

    private char[][] boardArray;
    private final int arrSize;

    public Board()
    {
        arrSize = 3;
        boardArray = new char[arrSize][arrSize];
    }

    public char[][] getBoard() 
    {
        return boardArray;
    }
}
