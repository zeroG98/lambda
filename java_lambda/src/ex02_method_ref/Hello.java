package ex02_method_ref;

public class Hello {
    private String name;

    public Hello() {
    }

    public Hello(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static String hi(String name) {
        return "hi " + name;
    }
}
