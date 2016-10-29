package entityClasses;

/**
 * This is an entity class, representing the board.
 */

public class Board
{

    private static char[][] boardArray;
    private static int boardSize;
	private static char playerX = 'X';
	private static char playerO = 'O';

	/**
	 * Constructor for the class that initializes private variables.
	 */
    public Board()
    {
        boardSize = 3;
        boardArray = new char[boardSize][boardSize];
		fillBoard();
    }
	
	/**
	 * Returns the board as it is at that moment in the game.
	 * @return 		the board array
	 */
    public static char[][] getBoard() 
    {
        return boardArray;
    }
	
	/**
	 * Fills the board with the empty string so we start with a clean board.
	 */
	public static void fillBoard()
	{
		for(int i = 0; i < boardSize; i++)
		{
			for(int j = 0; j < boardSize; j++)
			{
				boardArray[i][j] = ' '; //fill with empty char
			}
		}
	}
	
	/**
	 * Return the character for the selected place in the board
	 * @param x		the x coordinate of the board
	 * @param y		the y coordinate of the board
	 * @return 		X or O char if a player has selected the field, else empty string
	 */
	public static char getPositionChar(int x, int y)
	{
		return boardArray[x][y];
	}
	
	/**
	 * Get the size of the board. 
	 * @return 		size of the board
	 */
	public static int getSize()
	{
		return boardSize;
	}
	
	/**
	 * Sets X or O for the current player into the given position on the board.
	 * @param x				the x coordinate of the board
	 * @param y				the y coordinate of the board
	 * @param playerChar	the character of the current player
	 */
	public static void setPositionChar(int x, int y, char playerChar)
	{
		boardArray[x][y] = playerChar;
	}
	
	/**
	 * Checks if the board has a win for the current player.
	 * @param playerChar		the character of the current player
	 * @return 					true if the current player made a winning move
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
	 * Checks if the board is full or not.
	 * @return 		true if board is full, false if something is empty on the board
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
	
	/**
	 * Get the right character for current player.
	 * @param playerChar		the character of the current player
	 * @return 					character of player, X or O
	 */
	public static char getPlayer(char playerChar)
	{
		if(playerChar == 'X')
			return playerX;
		if(playerChar == 'O')
			return 'O';
		return playerO;
		
	}

	/**
	 * Checks if a certain position is empty or not.
	 * @param x		the x coordinate of the board
	 * @param y		the y coordinate of the board
	 * @return 		boolean false if position on board is empty, true if not empty position 
	 */
	public static boolean isOccupied(int x, int y)
	{
		if(boardArray[x][y] != ' ')
		{
			//place on board is not empty, it is occupied
			return true;
		}
		//place on board is empty, it is not occupied
		return false;
	}

}

