package entityClasses;

public class Board
{

    public static char[][] boardArray;
    public static int boardSize;
	public static char playerX = 'X';
	public static char playerO = 'O';

    public Board()
    {
        boardSize = 3;
        boardArray = new char[boardSize][boardSize];
		fillBoard();
    }
	
    public static char[][] getBoard() 
    {
        return boardArray;
    }
	
	public static void fillBoard()
	{
		for(int i = 0; i < boardSize; i++)
		{
			for(int j = 0; j < boardSize; j++)
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
	
	public static boolean checkBoardWinner(char playerChar)
	{
		//check rows
		if(boardArray[0][0] == boardArray[0][1]&& boardArray[0][1] == boardArray[0][2] && boardArray[0][0] == playerChar)
			return true;
		if(boardArray[1][0] == boardArray[1][1]&& boardArray[1][1] == boardArray[1][2] && boardArray[1][0] == playerChar)
			return true;
		if(boardArray[2][0] == boardArray[2][1]&& boardArray[2][1] == boardArray[2][2] && boardArray[2][0] == playerChar)
			return true;
		
		//check columns
		if(boardArray[0][0] == boardArray[1][0]&& boardArray[1][0] == boardArray[2][0] && boardArray[0][0] == playerChar)
			return true;
		if(boardArray[0][1] == boardArray[1][1]&& boardArray[1][1] == boardArray[2][1] && boardArray[0][1] == playerChar)
			return true;
		if(boardArray[0][2] == boardArray[1][2]&& boardArray[1][2] == boardArray[2][2] && boardArray[0][2] == playerChar)
			return true;
		
		//check corners
		if(boardArray[0][0] == boardArray[1][1]&& boardArray[1][1] == boardArray[2][2] && boardArray[0][0] == playerChar)
			return true;
		if(boardArray[0][2] == boardArray[1][1]&& boardArray[1][1] == boardArray[2][0] && boardArray[0][2] == playerChar)
			return true;
		
		return false;
	}
	
	
	public static boolean checkFullBoard()
	{
		for(int i = 0; i < boardSize; i++)
		{
			for(int j = 0; j < boardSize; j++)
			{
				if(boardArray[i][j] == ' ')
				{
					//the board is not full
					return false;
				}
			}
		}
		//the board is full
		return true;
	}
	
	
	
}

