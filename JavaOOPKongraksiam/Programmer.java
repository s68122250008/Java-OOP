package JavaOOPKongraksiam;
//  การสืบทอด inheritance จากแม่ Employee

public class Programmer extends Employee { // Programmer เป็นลูกของ Employee
    // public String skill = "java C#";

    // public Programmer(String name, double salary) {
    // super(name, salary); // การเข้าถึง constructor ของแม่
    // System.out.println("I'm Programmer");
    // }

    // * override = คลาสลูกอยากทำงานต่างจากคลาสแม่ แม้ใช้ชื่อเมธอดเดียวกัน
    public void bonus() {
        System.out.println("Bonus = 20%");
    }
}
