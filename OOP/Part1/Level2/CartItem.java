package OOPS.Part1.Level2;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalPrice());
    }
}
