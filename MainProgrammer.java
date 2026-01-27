public class MainProgrammer {
    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        p1.setID("1");
        p1.setName("Somsri");
        p1.setSalary(40000.0);
        p1.displayEmployee();

        Accouting acc1 = new Accouting();
        acc1.setID("2");
        acc1.setName("kan");
        acc1.setSalary(30000.0);

        acc1.displayEmployee();
    }
}
