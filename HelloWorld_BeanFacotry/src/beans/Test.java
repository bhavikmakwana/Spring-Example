package beans;

public class Test {
    static {
        System.out.println("static region from Test Class");
    }
    {
        System.out.println("instance region from Test Class");
    }
    Test(){
        System.out.println("Constructor from Test Class");
    }
    public void sayHello(){
        System.out.println("Hello World from Test class saying Hello.....");
    }
}
