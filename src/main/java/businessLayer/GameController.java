package businessLayer;

import entityClasses.*;  //get access to all classes in entityClasses with *

/**
 * This is a business class, representing the game.
 */

public class GameController {

	private Player _playerX;
	private Player _playerO;
	private Board _board;
	private Player _currentPlayer;

	
	/**
	 * A constructor for the class GameController.
	 * Initializes _playerX, _playerO, board.
	 */
	public GameController(String nameX, String nameO)
	{
		this._playerX = new Player('X', nameX);
		this._playerO = new Player('O', nameO);
		this._board = new Board();
		_currentPlayer = _playerX;
	}
	
	public GameController() 
	{
		this._playerX = new Player('X', "Player X");
		this._playerO = new Player('O', "Player O");
		_board = new Board();
	}
	
	public void setNames(String nameX, String nameO) 
	{
		_playerX.setName(nameX);
		_playerO.setName(nameO);
	}
	
	
	/**
	 * Get player after what sign is asked for.
	 * @return 		Player to use
	 */
	public Player getPlayerX()
	{
		return _playerX;
	}
	
	
	public Player getPlayerO()
	{
		return _playerO;
	}
	
	/**
	 * Get the board. 
	 * @return 		Board to use
	 */
	public char[][] getBoard()
	{
		return _board.getBoard();
	}

	/**
	 * Clears the board if called. Puts ' ' in every slot.
	 */
	public void clearBoard()
	{
		_board.fillBoard();
	}

	/**
	 * Game starts and is played out.
	 */
	public void startGame()
	{
		
	}
	/**
	 * Prints the board out.
	 */
	public void printBoard()
	{

	}

	public void display()
	{
		

	}
	public Player getWhoStarts()
	{
		//random number decides which player is returned
		return _playerX; //default until fixed
	}

	public Player getCurrentPlayer()
	{
		return _currentPlayer;
	}

	public int checkStatus()
	{
		//check for win or full board
		if(_board.checkBoardWinner(_currentPlayer.getSign()))
		{
			return 1;
		}
		else if(_board.checkFullBoard())
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}

	public boolean makeMove(int x, int y)
	{
		//connection to entityclasses to make a move
		//add to movesMade in player
		if(x >= 0 && x <= 2 && y >= 0 && y <= 2)
		{
			if(_board.isOccupied(x, y) == false)
			{
				_board.setPositionChar(x, y, _currentPlayer.getSign());
				_currentPlayer.addMove();

				return true;
			}
			return false;
		}
		else
		{
			return false;
		}
		
	}
	
	public void switchPlayer() 
	{
		if(_currentPlayer == _playerX) 
		{
			_currentPlayer = _playerO;
		}
		else 
		{
			_currentPlayer = _playerX;
		}
	}

}