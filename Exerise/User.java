package Exerise;

// Static variable 
class User {
    String name; // instance variable
    static int userCount; // static variable

    public User(String name) {
        this.name = name;
        userCount++;
    }

    void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Total users: " + User.userCount);
    }

    public static void main(String[] args) {
        User u1 = new User("peet");
        User u2 = new User("kan");
        User u3 = new User("nuy");

        u1.showInfo();
    }

}
