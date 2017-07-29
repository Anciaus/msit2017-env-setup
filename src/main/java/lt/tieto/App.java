package lt.tieto;

import static spark.Spark.get;

public class App 
{
    public static void main( String[] args )
    {
        get("/", (req, res) -> {
            String name = req.queryParams("name");
            return name != null ? name + " page" : "Home page";
        });

        get("/hello", (req, res) -> "Hello World");
    }
}
