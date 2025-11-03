package AgoraShop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String location = sc.nextLine();

        Agora agora = new Agora(email, location);

        Book b1 = new Book(25.69, 55512);
        Book b2 = new Book(42.69, 15617);

        agora.sale_item(b1);
        agora.sale_item(b2);
    }
}
