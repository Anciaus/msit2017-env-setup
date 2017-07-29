package lt.tieto;

import static spark.Spark.*;

public class App 
{
    public static void main( String[] args )
    {
        redirect.get("/", "/hello");

        get("/hello", (req, res) -> "Hello World");
    }
}
