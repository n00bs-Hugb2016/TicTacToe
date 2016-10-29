package entityClasses;

public class Board
{

    private static char[][] boardArray;
    private static int boardSize;
	private static char playerX = 'X';
	private static char playerO = 'O';

	/**
	 *constructor for the class that initializes private variables.
	 */
    public Board()
    {
        boardSize = 3;
        boardArray = new char[boardSize][boardSize];
		fillBoard();
    }
	
	/**
	 *get the board
	 *@return the board array
	 *@see char[][]
	 */
    public static char[][] getBoard() 
    {
        return boardArray;
    }
	
	/**
	 *fill the board with the empty string so we start with a clean board
	 */
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
	
	/**
	 *return the character for the selected place in the board
	 *@return X or O if a player has selected the field, else empty string
	 *@see char
	 */
	public static char getPositionChar(int x, int y)
	{
		return boardArray[x][y];
	}
	
	/**
	 *get the size of the board
	 *@return size of the board
	 *@see int
	 */
	public static int getSize()
	{
		return boardSize;
	}
	
	/**
	 *Sets X or O for the current Player into the right positionin the board
	 */
	public static void setPositionChar(int x, int y, char playerChar)
	{
		boardArray[x][y] = playerChar;
	}
	
	/**
	 *checks if the board has a win for our current Player
	 *@return true if the current Player made a win move
	 *@see boolean
	 */
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
	
	/**
	 *Checks if the board is full and the game stops
	 *@return true or false if the board is full or not
	 *@see boolean
	 */
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
	
	public static char getPlayer(char player)
	{
		if(player == 'X')
			return playerX;
		if(player == 'O')
			return 'O';
		return playerO;
		
	}
	
	
}

