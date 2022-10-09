package Models;

public class Product {
    private String name;
    private int price;
    private String expirationDate;
    private int quantity;

    public Product(String name, int price, String expirationDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.quantity = quantity;
    }
}
