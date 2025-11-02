package Tecware;

public class ProjectManager extends Employee {
    ProjectManager(String name) {
        super(name, 40000);
    }

    public void manage_process() {
        System.out.println("Managing process");
    }

    public void assign_developer() {
        System.out.println("Assign Developers");
    }

    public void check_progress() {
        System.out.println("Checking Progress");
    }
}
