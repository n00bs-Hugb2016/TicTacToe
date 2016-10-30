package UILayer; 

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class TTTWeb implements SparkApplication {
  public static void main(String[] args) {
    staticFileLocation("/public");

    TTTWeb web = new TTTWeb();

    String port = System.getenv("PORT");
    if (port != null) {
       port(Integer.valueOf(port));
    }

    web.init();
  }

  @Override
  public void init() {
    post ("/index", (req, res) -> "Hello");
  }
}
