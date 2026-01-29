
public class Accouting extends Employee {
    public String skill = "Manage Money";

    public Accouting(String name, double salary) {
        super(name, salary); // การเข้าถึง constructor ของแม่
        System.out.println("I'm Accounting");
    }
}
