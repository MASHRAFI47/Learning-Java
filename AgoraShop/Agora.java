package AgoraShop;

public class Agora extends Shop {
    String location;

    public Agora(String email, String location) {
        super(email);
        this.location = location;
    }

    public void sale_item(Item item) {
        System.out.println("Selling item in location: " + location + " with price " + item.unitPrice);
    }
}
