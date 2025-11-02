class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println(z);
    }

    public void substraction(int x, int y) {
        z = x - y;
        System.out.println(z);
    }
}

public class MyCalculation extends Calculation {
    public void multiplication(int x, int y) {
        int result = x * y;
        System.out.println(result);
    }

    public void division(int x, int y) {
        int result = x * y;
        System.out.println(result);
    }

    public static void main(String[] args) {
        MyCalculation m1 = new MyCalculation();

        m1.addition(10, 20);
        m1.substraction(10, 20);
        m1.multiplication(10, 20);
        m1.division(10, 20);
    }
}
