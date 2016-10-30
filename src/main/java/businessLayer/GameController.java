package businessLayer;

import entityClasses.*;  //get access to all classes in entityClasses with *

/**
 * This is a business class, representing the game.
 */

public class GameController {

	private Player _playerX;
	private Player _playerO;
	private Board board;

	
	/**
	 * A constructor for the class GameController.
	 * Initializes _playerX, _playerO, board.
	 */
	public GameController()
	{
		this._playerX = new Player('X');
		this._playerO = new Player('O');
		this.board = new Board();
	}
	/**
	 * Get player after what sign is asked for.
	 * @return 		Player to use
	 */
	public Player getPlayer(char sign)
	{
		if(sign == 'X')
		{
			return _playerX;
		}
		else
		{
			return _playerO;
		}
	}
	/**
	 * Get the board. 
	 * @return 		Board to use
	 */
	public Board getBoard()
	{
		return board;
	}

	/**
	 * Clears the board if called. Puts ' ' in every slot.
	 */
	public void clearBoard()
	{
		board.fillBoard();
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
	public Boolean checkStatus()
	{
		//check for win or full board
		return false;
	}
	public void makeMove()
	{
		//connection to entityclasses to make a move
		//add to movesMade in player
	}

}