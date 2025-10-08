import java.util.Scanner;

class Person {
    String name;
    int age;

    public void setDetails(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void displayDetails() {

        System.out.println("Name of the person : " + this.name);
        System.out.println("Enter the age of the person : " + this.age);

    }

    public void checkEligibility() {
        if (age >= 25) {
            System.out.println("This person is eligible");
        }

        else {
            System.out.println("This person is not eligible");
        }
    }

}

public class CodeWaveSolutions {

    public static void main(String[] args) {
        Person p1 = new Person();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the person : ");
        p1.name = sc.nextLine();
        System.out.println("Enter the age of the person : ");
        p1.age = sc.nextInt();

        p1.setDetails(p1.name, p1.age);
        p1.displayDetails();
        p1.checkEligibility();

        sc.nextLine();

        Person p2 = new Person();

        System.out.println("Enter the name of the person : ");
        p2.name = sc.nextLine();
        System.out.println("Enter the age of the person : ");
        p2.age = sc.nextInt();
        p2.setDetails(p2.name, p2.age);
        p2.displayDetails();
        p2.checkEligibility();

    }

}
