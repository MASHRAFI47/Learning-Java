import java.util.*;

public class PracticeInputStudent {
    String name;
    int id;
    int roll;

    public PracticeInputStudent(String name, int id, int roll) {
        this.name = name;
        this.id = id;
        this.roll = roll;
    }

    public void displayRecords() {
        System.out.println("Name: " + name + "Roll:" + roll + "Id:" + id);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<PracticeInputStudent> Students = new ArrayList<>();

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            String name = input.nextLine();
            System.out.print("Enter Id: ");
            int id = input.nextInt();
            System.out.print("Enter Roll: ");
            int roll = input.nextInt();
            input.nextLine();

            Students.add(new PracticeInputStudent(name, id, roll));
        }

        for (PracticeInputStudent student : Students) {
            student.displayRecords();
        }
    }
}
