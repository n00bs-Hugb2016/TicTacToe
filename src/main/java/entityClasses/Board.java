package entityClasses;

public class Board
{

    private static char[][] boardArray;
    private static int arrSize;

    public Board()
    {
        arrSize = 3;
        boardArray = new char[arrSize][arrSize];		
    }
	
    public static char[][] getBoard() 
    {
        return boardArray;
    }
}
