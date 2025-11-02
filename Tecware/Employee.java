package Tecware;

public class Employee {
    private String name;
    private double basic_salary;
    private double house_rent;
    private double allowance;

    public Employee(String name, double basic_salary) {
        this.name = name;
        this.basic_salary = basic_salary;
        this.house_rent = 0.5 * basic_salary;
        this.allowance = 10000;
    }

    public String show_name() {
        return name;
    }

    public void calculate_salary() {
        System.out.println(basic_salary + house_rent + allowance);
    }
}
