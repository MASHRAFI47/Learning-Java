public class StringMethods {
    public static void main() {
        String greeting = "Welcome to the house";
        String greeting2 = "Welcome to the house";
        System.out.println(greeting.length());
        System.out.println(greeting.indexOf("the"));
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.charAt(8));
        System.out.println(greeting == greeting2);
    }
}
