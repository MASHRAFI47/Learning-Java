class GetterSetter {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {
        GetterSetter p1 = new GetterSetter();
        p1.setName("Mashrafi");

        System.out.println(p1.getName());
    }
}
