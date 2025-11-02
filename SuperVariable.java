class SuperVariable {
    int speed = 50;
}

class Bike extends SuperVariable {
    int speed = 100;

    void display() {
        System.out.println(super.speed);
    }

    public static void main(String[] args) {
        Bike b1 = new Bike();

        b1.display();
    }
}
