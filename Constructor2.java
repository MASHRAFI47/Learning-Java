public class Constructor2 {
    int modelYear;
    String carModel;

    public Constructor2(int year, String model) {
        modelYear = year;
        carModel = model;
    }

    public static void main(String args[]) {
        Constructor2 obj1 = new Constructor2(2022, "Bmw");
        System.out.println(obj1.carModel + " " + obj1.modelYear);
    }
}
