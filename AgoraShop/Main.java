package AgoraShop;

public class Main {
    public static void main(String[] args) {
        Agora agora = new Agora("mbngms@gmail.com", "Mirpur");

        Book b1 = new Book(25.69, 55512);
        Book b2 = new Book(42.69, 15617);

        agora.sale_item(b1);
        agora.sale_item(b2);
    }
}
