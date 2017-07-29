package lt.tieto;

import static spark.Spark.get;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        get("/hello", (req, res) -> "Hello World");
    }
}
