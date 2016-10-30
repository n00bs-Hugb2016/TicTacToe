package businessLayer;

import entityClasses.*;  //get access to all classes in entityClasses with *

/**
 * This is a business class, representing the game.
 */

public class GameController {

	private Player _playerX;
	private Player _playerO;
<<<<<<< HEAD
	private Board _board;
	private Player _currentPlayer;
=======
	private Board board;
	private Player _currentPlayer;

>>>>>>> develop
	
	/**
	 * A constructor for the class GameController.
	 * Initializes _playerX, _playerO, board.
	 */
	public GameController(String nameX, String nameO)
	{
		this._playerX = new Player('X', nameX);
		this._playerO = new Player('O', nameO);
<<<<<<< HEAD
		this._board = new Board();
=======
		this.board = new Board();
>>>>>>> develop
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
	 * Get player X.
	 * @return 		PlayerX to use
	 */
	public Player getPlayerX()
	{
		return _playerX;
	}
	
	/**
	 * Get player O.
	 * @return 		PlayerO to use
	 */
	public Player getPlayerO()
	{
		return _playerO;
	}
	/**
	 * Get the player that is currently doing a move.
	 * @return 		Player, current, to use
	 */
	public Player getCurrentPlayer()
	{
		return _currentPlayer;
	}

	/**
	 * Get the board to use.
	 * @return 		char[][] to use as board.
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
	 * Checking to see if there is a winner or if the board is full.
	 * @return 		int for the status, 1, 2 or 0
	 */
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
	
	/**
	 * Registers the move for current player.
	 * @return 		Boolean true if possible to set the position
	 */
	public Boolean makeMove(int x, int y)
	{
		//connection to entityclasses to make a move
		//add to movesMade in player
<<<<<<< HEAD
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

	/**
	 * Switches current player to X or O
	 */
=======
		
	}
	
>>>>>>> develop
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