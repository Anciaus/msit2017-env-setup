package lt.tieto;

import lt.tieto.services.HelloWorldServiceImpl;

import static spark.Spark.get;

public class App
{
    public static void main( String[] args )
    {
        HelloWorldServiceImpl helloWorldService = new HelloWorldServiceImpl();

        get("/hello", (req, res) -> {
            String name = req.queryParams("name");
            return helloWorldService.getCustomizedHello(name != null ? name : "world!");
        });
    }
}
