package AgoraShop;

public class Book extends Item {
    int isbnNumber;

    Book(double unitPrice, int isbnNumber) {
        super(unitPrice);
        this.isbnNumber = isbnNumber;
    }
}
