package JavaOOPKongraksiam;
public class Overloading extends Employee {
    // overloading method คือ ชื่อ method เหมือนกันแต่ต่างกันที่พารามิเตอร์
    public void skill() {
        System.out.print("No Skill");
    }

    public void skill(String language) {
        System.out.println("Skill " + language);
    }

    public void skill(String... language) { // รับค่าเป็น Array รับกี่ค่าก็ได้ แล้ว loop แสดงผลออกมา
        for (int i = 0; i < language.length; i++) {
            System.out.println("Skill " + language[i]);
        }
    }

}
