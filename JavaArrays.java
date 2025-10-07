public class JavaArrays {
    public static void main(String args[]) {
        // String[] cars = { "Volvo", "BMW", "Corvette" };
        String[] cars = new String[2];
        cars[0] = "bmw";
        cars[1] = "Porsche";

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
