class Student {
    String name;
    static String school = "Green High"; // static variable

    void show() {
        System.out.println(name + " studies at " + school);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";

        Student s2 = new Student();
        s2.name = "Bob";

        s1.show();
        s2.show();
    }
}