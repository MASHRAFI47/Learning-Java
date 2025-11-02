class Vehicle {
    int speed = 150;

    public void display() {
        System.out.println(speed);
    }
}

public class Car extends Vehicle {
    int speed = 1200;

    public void display() {
        super.display();
        System.out.println(speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}
