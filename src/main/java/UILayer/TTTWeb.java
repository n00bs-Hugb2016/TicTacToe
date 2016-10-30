package UILayer; 

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import businessLayer.*;

public class TTTWeb implements SparkApplication 
{
  public static void main(String[] args) 
  {
    staticFileLocation("/public");

    SparkApplication web = new TTTWeb();

    String port = System.getenv("PORT");
    if (port != null) 
	{
       port(Integer.valueOf(port));
    }

    web.init();
  }

  @Override
  public void init() 
  {
	final GameController game = new GameController();
    post ("/index", (req, res) -> 
	{
		String param1 = req.queryParams("playerX");
		String param2 = req.queryParams("playerO");
		game.setNames(param1, param2);
		return res;
	});
	
	post("/game", (req, res) -> 
	{
		/*@Override
		public Object handle(Request request, Response response) 
		{
			//board.setBoard();
			//board.printBoard();
			return true;
		}*/
		return res; 
	});
	
  }
}
