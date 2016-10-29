package businessLayer;

//get access to all classes in entityClasses
import entityClasses.*;  

/**
 * This is a business class, representing the game.
 */

public class GameController {

	private Player _playerX;
	private Player _playerO;
	private Board board;

	
	public GameController()
	{
		this._playerX = new Player('X');
		this._playerO = new Player('O');
		this.board = new Board();
	}

	public Board getBoard()
	{
		return board;
	}
	public void clearBoard()
	{
		board.fillBoard();
	}

}