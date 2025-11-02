class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class MethodOverriding extends Vehicle {
    void run() {
        System.out.println("Bike is moving");
    }

    public static void main(String[] args) {
        MethodOverriding bike = new MethodOverriding();

        bike.run();
    }
}
