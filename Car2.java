class Vehicle2 {
    int speed = 50;

    public Vehicle2(int speed) {
        System.out.println(speed);
        this.speed = speed;
    }
}

public class Car2 extends Vehicle2 {
    public Car2() {
        super(100);
        System.out.println("Car is created");
    }

    public void display() {
        System.out.println("Vehicle Speed" + super.speed);
        System.out.println("Car is created" + speed);
    }

    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.display();
    }
}

// 100
// Car is created
// Vehicle Speed100
// Car is created100