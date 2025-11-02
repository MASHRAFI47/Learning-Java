class Person {
    protected String name;
    protected int age;
}

public class Student extends Person {
    private int id;
    private double cgpa;

    public void display() {
        System.out.printf("%s %d %d %.2f", name, age, id, cgpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 12;
        s1.id = 1;
        s1.cgpa = 4.00;

        s1.display();
    }
}
