package beans;

public class Employee {
    private String name;
    private int age;
    private String email;

    public Employee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void printData(){
        System.out.println("name -> "+name);
        System.out.println("age -> "+age);
        System.out.println("email -> "+email);
    }
}
