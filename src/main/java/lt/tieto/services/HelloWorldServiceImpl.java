package lt.tieto.services;

public class HelloWorldServiceImpl implements HelloWorldService {

    public String getCustomizedHello(String name) {
        return "Hello, " + name;
    }
}
