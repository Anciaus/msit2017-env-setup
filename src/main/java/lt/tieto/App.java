package lt.tieto;

import lt.tieto.services.HelloWorldServiceImpl;

import static spark.Spark.get;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HelloWorldServiceImpl helloWorldService = new HelloWorldServiceImpl();

        get("/hello", (req, res) -> {
            return helloWorldService.getCustomizedHello(req.queryParams("name"));
        });
    }
}
