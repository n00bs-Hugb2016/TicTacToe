package entityClasses;

public class Board
{

    public static char[][] boardArray;
    public static int arrSize;
	public static char playerX = 'X';
	public static char playerO = 'O';

    public Board()
    {
        arrSize = 3;
        boardArray = new char[arrSize][arrSize];
		fillBoard();
    }
	
    public static char[][] getBoard() 
    {
        return boardArray;
    }
	
	public static void fillBoard()
	{
		for(int i = 0; i < arrSize; i++)
		{
			for(int j = 0; j < arrSize; j++)
			{
				boardArray[i][j] = ' ';
			}
		}
	}
	public static char getPosition(int x, int y)
	{
		return boardArray[x][y];
	}
	
	public static void setPosition(int x, int y, char playerChar)
	{
		boardArray[x][y] = playerChar;
	}
}
