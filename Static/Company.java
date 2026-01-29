package Static;

public class Company {
    // static คือสามารถเรียกใช้ได้เลยโดยไม่ต้องสร้าง obj
    public final static String NAME = "Phumipat Studio";
    public static String createAt = "2025";

    static void service() {
        System.out.println("Programing And Game Developer");
    }
}
