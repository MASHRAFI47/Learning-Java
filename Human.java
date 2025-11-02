public class Human {
    public void eat() {
        System.out.println("Human is eating");
    }
}

class Boy extends Human {
    public void eat() {
        System.out.println("Boy is eating");
    }

    public static void main(String[] args) {
        Boy b1 = new Boy();
        b1.eat();

        Human h1 = new Boy();
        h1.eat(); // polymorphism
    }
}

class Girl extends Human {
    public void eat() {
        System.out.println("Girl is eating");
    }

    public static void main(String[] args) {
        Girl b1 = new Girl();
        b1.eat();

        Human h1 = new Girl();
        h1.eat(); // polymorphism
    }
}