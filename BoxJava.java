public class BoxJava {
    private int height, width;

    public BoxJava() {
        height = 10;
        width = 10;
    }

    public BoxJava(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {
        BoxJava b1 = new BoxJava();
        BoxJava b2 = new BoxJava(40, 50);

        System.out.println(b1.height + b1.width);
        System.out.println(b2.height + b2.width);
    }
}