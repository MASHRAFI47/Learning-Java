public class JavaMethods {
    static void myMethod(String name1, String name2) { // static methods must be called without objects
        System.out.println(name1 + name2);
    }

    public void newMethod() {
        System.out.println("Hehe"); // public must be called using objects
    }

    public static void main() {
        myMethod("Hello", "World");

        JavaMethods obj1 = new JavaMethods();
        obj1.newMethod();
    }
}
