package lt.tieto;

import static spark.Spark.get;

public class App 
{
    public static void main( String[] args )
    {
        get("/", (req, res) -> "Home page");

        get("/hello", (req, res) -> "Hello World");
    }
}
