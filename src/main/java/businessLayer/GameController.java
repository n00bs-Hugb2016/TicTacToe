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

}