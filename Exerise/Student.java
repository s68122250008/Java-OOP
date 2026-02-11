package Exerise;

public class Student {
    String name;
    String studentId;
    double gpa;

    void showInfo() {
        System.out.println("name: " + name + " Id: " + studentId + " gpa: " + gpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Phumipat";
        s1.studentId = "01";
        s1.gpa = 3.40;
        s1.showInfo();
        Student s2 = new Student();
        s2.name = "kanjanaporn";
        s2.studentId = "02";
        s2.gpa = 4.00;
        s2.showInfo();
    }
}
