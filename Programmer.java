// การสืบทอด inheritance จากแม่ Employee
public class Programmer extends Employee {
    public String skill = "java C#";

    public Programmer(String name, double salary) {
        super(name, salary);
        System.out.println("I'm Programmer");
    }
}
