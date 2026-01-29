//  การสืบทอด inheritance จากแม่ Employee
public class Programmer extends Employee {
    public String skill = "java C#";

    public Programmer(String name, double salary) {
        super(name, salary); // การเข้าถึง constructor ของแม่
        System.out.println("I'm Programmer");
    }
}
