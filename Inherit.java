class Employee {
    float salary = 1000;
}

class Programmer extends Employee {
    float bonus = 2000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.printf("This year salary: " + "%.2f%n", p.bonus);
        System.out.println(p.salary);
    }
}
