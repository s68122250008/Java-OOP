public class Employee {
    // * Attribute
    private String id;
    private String name;
    private double salary;
    // * Static Attribute
    static int minSalary = 12000;
    

    // * Method กำหนดข้อมูลให้ Attribute ไม่ต้องแตะ Attribute โดยตรง
    public void setID(String id) { // เพื่อเข้าถึง id
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // * ดึงข้อมูลจาก Attribute
    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    // * Default Contructor คือทำงานเมื่อมีการสร้าง obj
    public Employee() {

    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    // * End Contructor

    public void displayEmployee() {
        System.out.println("id = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);
    }

}
